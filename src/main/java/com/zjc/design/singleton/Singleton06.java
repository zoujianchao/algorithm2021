package com.zjc.design.singleton;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/19
 * @description : 有参数的单例
 */
public class Singleton06 {
    private static Singleton06 instance = null;
    private final int parmaA;
    private final int parmaB;

    private Singleton06() {
        this.parmaA = Config.PARAM_A;
        this.parmaB = Config.PARAM_B;
    }

    public static synchronized Singleton06 getInstance() {
        if (instance == null) {
            instance = new Singleton06();
        }
        return instance;
    }
}

class Config {
    public final static int PARAM_A = 123;
    public final static int PARAM_B = 234;
}