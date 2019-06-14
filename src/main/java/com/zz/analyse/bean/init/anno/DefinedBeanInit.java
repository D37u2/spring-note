package com.zz.analyse.bean.init.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DefinedBeanInit {

    String value() default "";

}
