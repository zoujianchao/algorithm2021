package com.zjc.design.singleton;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/19
 * @description : 双重检查
 */
public class Singleton03 {
    private static volatile Singleton03 singleton03;

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        if (singleton03 == null) {
            synchronized (Singleton03.class) {
                if (singleton03 == null) {
                    singleton03 = new Singleton03();
                }
            }
        }
        return singleton03;
    }
}
