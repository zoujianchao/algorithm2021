package com.zjc.design.singleton;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/19
 * @description : 静态内部类
 */
public class Singleton04 {
    private Singleton04() {
    }

    private static class Singleton04Instance {
        private final static Singleton04 INSTANCE = new Singleton04();
    }

    public static synchronized Singleton04 getInstance() {
        return Singleton04Instance.INSTANCE;
    }
}
