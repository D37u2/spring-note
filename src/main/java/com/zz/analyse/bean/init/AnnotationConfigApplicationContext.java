package com.zz.analyse.bean.init;

import com.zz.analyse.bean.init.anno.DefinedBeanInit;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author: zhoujiong
 * @description: 模拟Spring javaconfig 扫描包并注入到容器中
 * @className: AnnotationConfigApplicationContext
 * @date: 2019/6/14 13:55
 */
public class AnnotationConfigApplicationContext {

    private static final ConcurrentMap beanMap = new ConcurrentHashMap();

    private static final List<String> scanList = new ArrayList();

    public Object getBean(String beanName){

        System.out.println("getBean："+beanName);

        return beanMap.get(beanName);
    }
    public Object getBean(Class clazz){
        return getBean(clazz.getName());
    }

    /**
     * @author: zhoujiong
     * @description: 注册
     * @className: AnnotationConfigApplicationContext
     * @date: 2019/6/14 15:31
     */
    public void register(){

        for (String beanName : scanList) {
            try {
                Class clazz = Class.forName(beanName);
                Object classObject = clazz.newInstance();

                System.out.println("将文件下的文件名反射，获取类名，存在context中");

                beanMap.put(beanName,classObject);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    /**
     * @author: zhoujiong
     * @description: 扫描
     * @className: AnnotationConfigApplicationContext
     * @date: 2019/6/14 15:21
     */
    public void scan(String packageName){

        String rootPath = this.getClass().getResource("").getPath();

        System.out.println("获取根目录："+rootPath);

        String packagePath = rootPath.substring(0,rootPath.lastIndexOf("classes")) + "classes/" + packageName.replaceAll("\\.","\\/");

        System.out.println("获取文件目录："+packagePath);

        System.out.println("获取packageName下的所有类");

        traverseFolder2(packagePath,packageName);


    }

    /***
     * @author: zhoujiong
     * @description: 递归获取文件下所有文件
     * @date: 2019/6/14 14:03
     * @param: [path]
     * @return: void
     */
    public void traverseFolder2(String path,String packageName) {

        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            String[] s = file.list();
            System.out.println(s.toString());
            if (null == files || files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder2(file2.getAbsolutePath(),packageName);
                    } else {

                        try {

                            String beanName = packageName + "." +file2.getName();

                            beanName = beanName.substring(0,beanName.lastIndexOf(".class"));

                            System.out.println(beanName);

                            Class clazz = Class.forName(beanName);
                            //判断该bean是否是需要注入的bean ，包含DefinedBeanInit注解的才是需要注入的bean
                            if(clazz.isAnnotationPresent(DefinedBeanInit.class)){

                                System.out.println("将需要实例化的bean放入List中");

                                scanList.add(beanName);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("文件:" + file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }

}
