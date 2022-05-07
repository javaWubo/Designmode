/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a18;

import com.ub8.a8.a16.ConcreateHandler1;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Client.java
 * @Description
 * @createTime 2022年04月21日 15:40:00
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(StrategyEnum.STRATEGY_1.getStrategy());
        context.doAnything();
    }
}
