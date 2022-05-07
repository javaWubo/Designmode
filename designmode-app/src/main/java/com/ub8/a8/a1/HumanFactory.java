/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a1;

import com.ub8.a8.a1.domain.Human;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName HumanFactory.java
 * @Description
 * @createTime 2022年04月19日 20:17:00
 */
public class HumanFactory extends AbstractHumanFactory{
    public <T extends Human> T createHuman(Class<T> tClass) {
        Human human = null ;
        try {
            human = (T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
