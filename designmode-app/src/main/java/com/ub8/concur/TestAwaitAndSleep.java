/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.concur;

import sun.security.provider.MD5;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName concurrent.java
 * @Description
 * @createTime 2022年04月28日 20:01:00
 */
public class TestAwaitAndSleep {

    public static void main(String[] args) {
        Runnable runnable = new RunObj();
        for ( int i = 0 ; i< 3; i++) {
            Thread thread = new Thread(runnable);
            thread.setName("thread"+i);
            thread.start();
        }
    }

    static class RunObj implements Runnable{

        public void run() {

            while (true){
                synchronized(TestAwaitAndSleep.class){
                    try {
                        System.out.println("sout_begin: " + Thread.currentThread().getName() +"time:"+System.currentTimeMillis() );
                        Thread.sleep(3000);
                        System.out.println("sout_end: " + Thread.currentThread().getName()+"time:"+System.currentTimeMillis());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
