/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a26;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Context.java
 * @Description
 * @createTime 2022年04月21日 14:33:00
 */
public class Context {

    public static final OpenLiftStatus openLiftStatus = new OpenLiftStatus();
    public static final CloseLiftStatus closeLiftStatus = new CloseLiftStatus();
    public static final RunLiftStatus runLiftStatus = new RunLiftStatus();
    public static final StopLiftStatus stopLiftStatus = new StopLiftStatus();

    private LiftStatus liftStatus;

    public void setLiftStatus(LiftStatus liftStatus) {
        this.liftStatus = liftStatus;
        this.liftStatus.setContext(this);
    }

    public LiftStatus getLiftStatus() {
        return liftStatus;
    }

    public void open(){
        this.liftStatus.open();
    }

    public void close(){
        this.liftStatus.close();
    }

    public void run(){
        this.liftStatus.run();
    }

    public void stop(){
        this.liftStatus.stop();
    }


}
