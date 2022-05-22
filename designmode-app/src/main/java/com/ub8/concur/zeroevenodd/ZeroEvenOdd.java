/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur.zeroevenodd;

import java.util.concurrent.Semaphore;

public class ZeroEvenOdd {
    private int n;
    private Semaphore zeroSem = new Semaphore(1);
    private Semaphore evenSem = new Semaphore(0);
    private Semaphore oddSem = new Semaphore(0);


    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    public void zero() throws InterruptedException {
        for (int i = 0; i < n; i++) {
                zeroSem.acquire();
                System.out.print("0");
                if(i%2 == 0){
                   evenSem.release();
                }else{
                    oddSem.release();
                }

        }
    }

    public void even() throws InterruptedException {
        for (int i = 1; i <= n; i = i+2) {
             evenSem.acquire();
             System.out.print(i);
             zeroSem.release();
            }

    }

    public void odd() throws InterruptedException {
        for (int i = 2; i <= n; i = i+2) {
            oddSem.acquire();
            System.out.print(i);
            zeroSem.release();
         }

    }
}
