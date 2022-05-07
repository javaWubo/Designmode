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
public class RunLiftStatus extends LiftStatus {
    public void open() {
       // do nothing
    }

    public void close() {
        // do nothing
    }

    public void run() {
        System.out.println("电梯运行");
    }

    public void stop() {
        super.context.setLiftStatus(Context.stopLiftStatus);
        super.context.stop();
    }
}
