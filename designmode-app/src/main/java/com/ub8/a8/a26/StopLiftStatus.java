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
public class StopLiftStatus extends LiftStatus {
    public void open() {
        super.context.setLiftStatus(Context.openLiftStatus);
        super.context.open();
    }

    public void close() {
        super.context.setLiftStatus(Context.closeLiftStatus);
        super.context.close();
    }

    public void run() {

    }

    public void stop() {
        System.out.println("电梯停止");
    }
}
