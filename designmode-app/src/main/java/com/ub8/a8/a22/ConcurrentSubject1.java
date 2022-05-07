/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a22;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName ConcurrentSubject1.java
 * @Description
 * @createTime 2022年04月21日 16:30:00
 */
public class ConcurrentSubject1 extends Subject{
        public void doSomething(){
            System.out.println("ConcurrentSubject1#doSomething()");
            super.notifyAllObserver();
        }
}
