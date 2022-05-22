/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur.zeroevenodd;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class ZeroEvenOddErrorDemo {
    private int n;
    private AtomicInteger atomicNum = new AtomicInteger(0);
    private AtomicInteger atomicFlag = new AtomicInteger(0);
    public ZeroEvenOddErrorDemo(int n) {
        this.n = n;
    }

    public void zero() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (atomicFlag){
                while (atomicFlag.get()%2 !=0) atomicFlag.wait();
                System.out.print("0");
                atomicFlag.incrementAndGet();
                atomicFlag.notifyAll();
            }
        }


    }

    public void even() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (atomicFlag){
                while (atomicFlag.get()%2 ==0) atomicFlag.wait();
                synchronized (atomicNum){
                    while (atomicNum.get()%2 ==0) atomicNum.wait();
                    System.out.print(atomicNum.incrementAndGet());
                    atomicNum.notifyAll();
                }
                atomicFlag.incrementAndGet();
                atomicFlag.notifyAll();
            }

        }

    }

    public void odd() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (atomicFlag) {
                while (atomicFlag.get() % 2 == 0) atomicFlag.wait();
                synchronized (atomicNum) {
                    while (atomicNum.get() % 2 != 0) atomicNum.wait();
                    System.out.print(atomicNum.incrementAndGet());
                    atomicFlag.incrementAndGet();
                    atomicNum.notifyAll();
                }
                atomicFlag.incrementAndGet();
                atomicFlag.notifyAll();
            }
        }

    }
}
