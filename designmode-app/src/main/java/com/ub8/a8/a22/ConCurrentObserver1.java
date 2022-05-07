/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a22;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName ConCurrentObserver1.java
 * @Description
 * @createTime 2022年04月21日 16:31:00
 */
public class ConCurrentObserver1 implements Observer{
    public void update() {
        System.out.println("ConCurrentObserver1#update");
    }
}
