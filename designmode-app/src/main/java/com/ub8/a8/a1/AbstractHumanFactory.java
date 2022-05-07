/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a1;

import com.ub8.a8.a1.domain.Human;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName AbstractHumanFactory.java
 * @Description
 * @createTime 2022年04月19日 20:15:00
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> tClass);

}
