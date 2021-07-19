package com.zjc.design.singleton;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/19
 * @description : 懒汉式,线程安全,同步方法
 */
public class Singleton02 {
    private static Singleton02 singleton02;

    private Singleton02() {
    }

    public static synchronized Singleton02 getInstance() {
        if (singleton02 == null) {
            singleton02 = new Singleton02();
        }
        return singleton02;
    }
}
