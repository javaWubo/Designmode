/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur;

/**
 * 通过 sync 关键字方式
 */
public class Foo1 {

    private static final Object lock = new Object();
    private  int flag = 1;

    public void  printFirst() throws InterruptedException {
        synchronized (lock){
            while (flag == 1){
                System.out.println("first");
                flag = 2;
                lock.wait();
            }
            lock.notifyAll();
        }

    }

    public void printSecond() throws InterruptedException {
        synchronized (lock){
            while (flag == 2){
                System.out.println("second");
                flag=3;
                lock.wait();
            }
            lock.notifyAll();
        }
    }

    public void printThree() throws InterruptedException {
        synchronized (lock){
            while (flag == 3){
                System.out.println("three");
                flag = 1;
                lock.wait();
            }
            lock.notifyAll();
        }
    }
}
