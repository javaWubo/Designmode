/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur.exchange;

public class FooBar2 {

    private int n;
    private static final Object lock = new Object();
    private volatile Integer flag = 0;

    public FooBar2(int n) {
        this.n = n;
    }

    public void foo() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (lock){
                while ( flag%2 != 0) lock.wait();
                System.out.print("foo");
                flag++;
                lock.notifyAll();
            }

        }
    }

    public void bar() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (lock){
                while ( flag%2 == 0) lock.wait();
                System.out.println("bar");
                flag++;
                lock.notifyAll();
            }
        }
    }
}
