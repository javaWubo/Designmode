/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 使用 Atomic 类
 */
public class Foo2 {

    private AtomicInteger flag = new AtomicInteger(0);
    public void  printFirst() throws InterruptedException {
            while (flag.get() != 0){

            }
            System.out.println("first");
            flag.incrementAndGet();
    }

    public void printSecond() throws InterruptedException {
        while (flag.get() != 1){

        }
        System.out.println("second");
        flag.incrementAndGet();
    }

    public void printThree() throws InterruptedException {
        while (flag.get() != 2){};
        System.out.println("three");
        flag.decrementAndGet();
        flag.decrementAndGet();
    }
}
