package com.zz.spring.test.anno;

import com.zz.spring.anno.Entity;
import com.zz.spring.entity.CityEntity;

public class TestAnno {

    public static void main(String[] args) {

        CityEntity cityEntity = new CityEntity();

        System.out.println(getEntityValue(cityEntity));
    }

    public static String getEntityValue(Object object){

        //获取Class对象
        Class clazz = object.getClass();

        //判断是否使用了某注解

        System.out.println(clazz.isAnnotationPresent(Entity.class));

        if(clazz.isAnnotationPresent(Entity.class)){
            Entity entity = (Entity) clazz.getAnnotation(Entity.class);

            String value = entity.value();

            return value;
        }

        return null;
    }

}
