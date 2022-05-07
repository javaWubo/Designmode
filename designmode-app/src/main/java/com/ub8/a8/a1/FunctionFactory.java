/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a1;

import com.ub8.a8.a1.domain.Human;
import com.ub8.a8.a1.domain.YellowHuman;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName FunctionFactory.java
 * @Description 模板方法
 * @createTime 2022年04月19日 20:10:00
 */
public class FunctionFactory {

    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        Human yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();;
        yellowHuman.talk();
    }

}
