/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a22;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Client.java
 * @Description
 * @createTime 2022年04月21日 16:32:00
 */
public class Client {
    public static void main(String[] args) {
        Observer observer = new ConCurrentObserver1();
        ConcurrentSubject1 subject = new ConcurrentSubject1();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
