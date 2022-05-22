/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur.sequence;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 使用 Atomic 类
 */
public class Foo2 {

    private  AtomicInteger firstFlag = new AtomicInteger(0);
    private AtomicInteger secondFlag = new AtomicInteger(0);
    public void  printFirst() throws InterruptedException {
            System.out.println("first");
            synchronized (firstFlag){
                while (firstFlag.get() == 1) firstFlag.wait();
                firstFlag.incrementAndGet();
                firstFlag.notifyAll();
            }
    }

    public void printSecond() throws InterruptedException {
        while (firstFlag.get() != 1){}
        System.out.println("second");
        synchronized (secondFlag){
            while ( secondFlag.get() == 1){
                secondFlag.wait();
            };
            secondFlag.incrementAndGet();
            secondFlag.notifyAll();
        }
    }

    public void printThree() throws InterruptedException {
        while (secondFlag.get() != 1){};
        System.out.println("three");
        // synchronized  解决 secondFlag.decrementAndGet 和 secondFlag.incrementAndGet 的并发问题
        synchronized (secondFlag){
            while (secondFlag.get() == 0) secondFlag.wait();
            secondFlag.decrementAndGet();
            secondFlag.notifyAll();
        }
        synchronized (firstFlag){
           while (firstFlag.get() == 0) firstFlag.wait();
           firstFlag.decrementAndGet();
           firstFlag.notifyAll();
        }

    }
}
