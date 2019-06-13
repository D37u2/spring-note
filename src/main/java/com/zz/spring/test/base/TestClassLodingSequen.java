package com.zz.spring.test.base;

/**
 * @author: zhoujiong
 * @description: 测试类的加载顺序
 *
 * UserClassLoadingSequence中UserImpl对象因为没有被引用，所以不会去加载UserImpl以及其中的静态方法
 *
 * @className: TestClassLodingSequen
 * @date: 2019/6/14 0:24
 * @Version 1.0
 */
public class TestClassLodingSequen {

    public static void main(String[] args) {
        UserClassLoadingSequence userClassLoadingSequence = new UserClassLoadingSequence();
        userClassLoadingSequence.query();
    }
}
