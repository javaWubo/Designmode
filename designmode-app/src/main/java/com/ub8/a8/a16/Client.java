/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a16;

import com.ub8.a8.a16.domain.Request;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName Client.java
 * @Description
 * @createTime 2022年04月21日 11:34:00
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request();

        ConcreateHandler1 concreateHandler1 = new ConcreateHandler1();
        ConcreateHandler2 concreateHandler2 = new ConcreateHandler2();
        concreateHandler1.setNextHandler(concreateHandler2);

        concreateHandler1.doProcess(request);
    }
}
