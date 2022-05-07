/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a1.domain;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName YellowHuman.java
 * @Description
 * @createTime 2022年04月19日 20:13:00
 */
public class YellowHuman implements Human{

    public void getColor() {
        System.out.println(YellowHuman.class.getName() +"::"+ "getColor");
    }

    public void talk() {
        System.out.println(YellowHuman.class.getName() +"::"+ "talk");
    }
}
