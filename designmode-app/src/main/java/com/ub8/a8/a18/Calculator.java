/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a18;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Calculator.java
 * @Description
 * @createTime 2022年04月21日 15:45:00
 */
public enum Calculator {
    ADD("+"){
        public int exe(int a, int b) {
            return a+b;
        }
    };
    private String flag ;

    public void setFlag(String flag) {
        this.flag = flag;
    }

    Calculator(String flag) {
        this.flag = flag;
    }

    public abstract int exe(int a , int b);

    public static void main(String[] args) {
       int r = Calculator.ADD.exe(1,2);
       System.out.println(r);
    }
}
