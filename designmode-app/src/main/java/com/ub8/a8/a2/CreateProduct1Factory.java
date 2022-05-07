/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a2;

import com.ub8.a8.a2.domain.ProductA;
import com.ub8.a8.a2.domain.ProductA1;
import com.ub8.a8.a2.domain.ProductB1;

/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName CreateProductAFactory.java
 * @Description
 * @createTime 2022年04月20日 20:54:00
 */
public class CreateProduct1Factory extends AbstractCreateProductFactory {
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
