/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur;

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

    public void printSecond(){
        try {
            two.acquire();
            System.out.println("second");
            three.release();
        } catch (InterruptedException e) {

        }
    }

    public void printThree(){
        try {
            three.acquire();
            System.out.println("three");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
