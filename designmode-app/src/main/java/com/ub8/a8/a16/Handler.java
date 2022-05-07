/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a16;

import com.ub8.a8.a16.domain.Level;
import com.ub8.a8.a16.domain.Request;
import com.ub8.a8.a16.domain.Response;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Handler.java
 * @Description
 * @createTime 2022年04月21日 11:25:00
 */
public abstract class Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    public Response process(Request request ){
        Response response = null;
        if (request.getLevel() == this.getRequestLevel()){
            return this.doProcess(request);
        }else {
            if (this.nextHandler != null){
                response = this.nextHandler.process(request);
            }else{

            }
        }
        return response;
    }

    protected abstract Response doProcess(Request request);

    protected abstract Level getRequestLevel();



}
