package com.zz.spring.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * RetentionPolicy.SOURCE 注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃
 *
 * RetentionPolicy.RUNTIME 注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期
 *
 * RetentionPolicy.RUNTIME 注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {

    String value() default  "";
}
