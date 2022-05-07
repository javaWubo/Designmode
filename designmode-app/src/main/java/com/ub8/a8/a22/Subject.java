/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Subscript.java
 * @Description 被观察者
 * @createTime 2022年04月21日 16:26:00
 */
public abstract class Subject {

    public List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyAllObserver(){
        for (Observer o : observerList ) {
            o.update();
        }
    }
}
