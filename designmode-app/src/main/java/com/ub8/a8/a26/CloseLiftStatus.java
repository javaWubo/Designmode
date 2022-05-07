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
public class CloseLiftStatus extends LiftStatus {
    public void open() {
        super.context.setLiftStatus(Context.openLiftStatus);
        super.context.open();
    }

    public void close() {
        System.out.println("电梯门关闭");
    }

    public void run() {
        super.context.setLiftStatus(Context.runLiftStatus);
        super.context.run();
    }

    public void stop() {
        super.context.setLiftStatus(Context.stopLiftStatus);
        super.context.stop();
    }
}
