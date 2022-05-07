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
 * @ClassName ConcreateHandler1.java
 * @Description
 * @createTime 2022年04月21日 11:33:00
 */
public class ConcreateHandler2 extends Handler {

    protected Response doProcess(Request request) {
        return null;
    }

    protected Level getRequestLevel() {
        return new Level(1);
    }
}
