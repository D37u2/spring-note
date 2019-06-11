package com.zz.spring.proxy;


import lombok.extern.slf4j.Slf4j;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author: zhoujiong
 * @description: 手写一个代理工具类,代理类中新增打印 iron man
 * @className: ProxyUtil
 * @date: 2019/6/11 10:37
 * @Version 1.0
 */
@Slf4j
public class ProxyUtil {

    /**
     * @Author zhoujiong
     * @Description 代理工具类
     * @Param [target]
     * @return java.lang.Object
     * @Date 2019/6/11 10:59
     */
    public static Object createProxy(Object target){

        //暂定模板为UserTimerImpl模板

        Object proxy;

        Class clazz = target.getClass().getInterfaces()[0];

        /*
        getClasses得到该类及其父类所有的public的内部类
        getDeclaredClasses得到该类所有的内部类，除去父类的
        Class clazz2 = target.getClass().getClasses()[0];
        */

        String line="\n";

        Method[] methods = clazz.getMethods();

        log.info("获取目标对象中的方法"+methods.toString());

        String packageC = "package com.zz.spring.proxy;"+line;
        String classStartC = "public class $Proxy0 implements "+clazz.getName()+" {"+line;
        String variateC = "     private "+clazz.getName()+" target;"+line;
        String constructorC = "     public $Proxy0("+clazz.getName()+" target){"+line+
                "        this.target = target;"+line+
                "    }"+line;
        String methodC = "";
        String classEndC = "}"+line;

        for (Method method : methods) {

            String returnTypeName = method.getReturnType().getTypeName();

            String argsC = "";
            String argsCo;
            String returnC;
            String retC = "";

            Class[] args = method.getParameterTypes();

            log.info("方法："+method.getName()+"对应的参数为："+args.toString());

            int index = 1;
            for (Class arg : args) {
                argsC = arg.getTypeName() + " p"+index+",";
                index++;
            }

            if(argsC.length()>0){
                log.info("判断是否有参数");
                argsCo = argsC.substring(0,argsC.lastIndexOf(','));
            }else {
                argsCo = argsC;
            }

            if(returnTypeName.trim().equals("void")){
                log.info("判断方法是否有返回参数：没有");
                returnC = "void";
            }else {
                log.info("判断方法是否有返回参数：有");
                returnC = returnTypeName;
                retC = "return ";
            }

            String childMethodC =
                    "    public "+returnC+" "+method.getName()+"("+argsCo+") {"+line+
                    "        log.info(\"--------iron man-------\");"+line+
                    "        "+retC+"target."+method.getName()+"("+argsCo+");"+line+
                    "    }";
            methodC = methodC + childMethodC;
        }

        String fileC = packageC + classStartC + variateC + constructorC + methodC +line+ classEndC;

        log.info("将生成的字符串写进java文件");

        File file = new File("E:\\com\\zz\\spring\\proxy\\$Proxy0.java");

        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileOutputStream = new FileWriter(file);
            fileOutputStream.write(fileC);
            fileOutputStream.flush();
            fileOutputStream.close();

            log.info("对Java文件进行编译");

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

            StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileMgr.getJavaFileObjects(file);

            JavaCompiler.CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
            t.call();
            fileMgr.close();

            log.info("对Java文件进行编译完成");

            log.info("生成代理对象，由于代理对象的构造方法不是默认的构造方法，所以不能使用默认的class.newInstance()");

            log.info("通过URLClassLoader加载Class文件");

            URL[] urls = new URL[]{new URL("file:E:\\\\")};

            log.info("获取G盘下所有Class文件");
            URLClassLoader urlClassLoader = new URLClassLoader(urls);

            log.info("加载代理对象com.zz.spring.proxy.$Proxy0");
            Class clazz2 = urlClassLoader.loadClass("com.zz.spring.proxy.$Proxy0");

            log.info("通过手写的构造方法创建实例");


            log.info("通过方法名和方法参数类型确定构造参数，即参数类型为目标对象类型");
            Constructor constructor =  clazz2.getConstructor(clazz);

            log.info("构建实例");
            proxy = constructor.newInstance(target);

            return proxy;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
