/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a26;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName LiftStatus.java
 * @Description
 * @createTime 2022年04月21日 14:33:00
 */
public abstract class LiftStatus {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
