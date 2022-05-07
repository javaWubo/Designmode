/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a18;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Enum.java
 * @Description
 * @createTime 2022年04月21日 15:38:00
 */
public enum StrategyEnum {

    STRATEGY_1(1, new Strategy1impl()),
    STRATEGY_2(2, new Strategy2impl()),
    ;
    private Integer code;
    private Strategy strategy;

    StrategyEnum() {
    }

    StrategyEnum(Integer code, Strategy strategy) {
        this.code = code;
        this.strategy = strategy;
    }

    public Integer getCode() {
        return code;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
