/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur.sequence;

/**
 * 三个不同的线程 A、B、C 将会共用一个 Foo 实例。
 * 线程 A 将会调用 first() 方法
 * 线程 B 将会调用 second() 方法
 * 线程 C 将会调用 third() 方法
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/print-in-order
 * 请设计修改程序，以确保 second() 方法在 first() 方法之后被执行，third() 方法在 second() 方法之后被执行。
 */
public class SequencePrint {
    public static void main(String[] args) {
         Foo2 foo = new Foo2();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    foo.printThree();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(()->{
                try {
                    foo.printFirst();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(()->{
                try {
                    foo.printSecond();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
