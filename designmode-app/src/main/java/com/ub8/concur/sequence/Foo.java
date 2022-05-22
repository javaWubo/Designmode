/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur.sequence;

import java.util.concurrent.Semaphore;

/**
 * 通过信号量方式
 */
public class Foo {
    private Semaphore two = new Semaphore(0);
    private Semaphore three = new Semaphore(0);
    public void printFirst(){
        System.out.println("first");
        two.release();
    }

    public void printSecond() throws InterruptedException {
            two.acquire();
            System.out.println("second");
            three.release();
    }

    public void printThree() throws InterruptedException {
            three.acquire();
            System.out.println("three");
    }


}
