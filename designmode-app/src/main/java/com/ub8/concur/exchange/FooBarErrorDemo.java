/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur.exchange;

import java.util.concurrent.Semaphore;

/**
 * 错误案例 会造成死锁
 */
public class FooBarErrorDemo {

    private int n;
    private static final Object lock = new Object();
    private volatile Integer flag = 0;

    public FooBarErrorDemo(int n) {
        this.n = n;
    }
    // 错误案例 会造成死锁
    public void foo() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (lock){
                while ( flag%2 == 0){
                    System.out.print("foo");
                    flag++;
                    lock.wait();
                }
                lock.notifyAll();
            }

        }
    }

    public void bar() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (lock){
                while ( flag%2 != 0){
                    System.out.print("bar");
                    flag++;
                    lock.wait();
                }
                lock.notifyAll();
            }
        }
    }
}
