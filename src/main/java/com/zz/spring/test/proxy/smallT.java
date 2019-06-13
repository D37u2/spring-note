package com.zz.spring.test.proxy;

/**
 * @author: zhoujiong
 * @description: 在当前类可以new 当前类的对象
 * @className: smallT
 * @date: 2019/6/13 11:40
 * @Version 1.0
 */
public class smallT {

    public static void main(String[] args) {
        smallT smallT = new smallT();
        System.out.println(smallT.get());
    }

    public int get(){
        return 1;
    }

}
