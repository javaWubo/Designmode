/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a26;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName OpenLiftStatus.java
 * @Description
 * @createTime 2022年04月21日 14:43:00
 */
public class OpenLiftStatus extends LiftStatus {
    public void open() {
        System.out.println("电梯门开启");
    }

    public void close() {
        super.context.setLiftStatus(Context.closeLiftStatus);
        super.context.close();
    }

    public void run() {
        // not do something
    }

    public void stop() {
        // not do something
    }
}
