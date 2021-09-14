package com.zjc.algorithm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2021/8/23
 * @description :
 */
public class Test3 {
    public static void main(String[] args) {
        double x = 44.5;
        //数据库都查出来
        List<Test> tests = new ArrayList<>();
        tests.forEach(t -> {
            if (x >= t.getStart() && x <= t.getEnd()) {
                System.out.println("在区间" + t.getStart() + t.getEnd() + "中");
                return;
            }
        });
    }
}
