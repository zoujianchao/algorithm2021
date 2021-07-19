package com.zjc.design.singleton;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/7/19
 * @description : 枚举
 */
public enum Singleton05 {
    INSTANCE;
    public void get() {
        System.out.println("Singleton05");
    }
}
