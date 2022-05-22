/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur.exchange;

import com.ub8.concur.sequence.Foo;

/**
 * 两个不同的线程将会共用一个 FooBar 实例：
 * 线程 A 将会调用 foo() 方法，而
 * 线程 B 将会调用 bar() 方法 19359
 * 请设计修改程序，以确保 "foobar" 被输出 n 次。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/print-foobar-alternately
 */
public class ExchangePrint {

    public static void main(String[] args) {
        FooBar2 fooBar = new FooBar2(10);
        new Thread(()->{
            try {
                fooBar.foo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                fooBar.bar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
