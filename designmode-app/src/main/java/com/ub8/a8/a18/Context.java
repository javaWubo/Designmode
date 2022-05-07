/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a18;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Context.java
 * @Description
 * @createTime 2022年04月21日 15:36:00
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything(){
        this.strategy.doSomething();
    }
}
