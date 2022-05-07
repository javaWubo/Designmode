/*
 * Copyright (C) 2022 Baidu, Inc. All Rights Reserved.
 */
package com.ub8.a8.a22;


/**
 * @author wubo05
 * @version 1.0.0
 * @ClassName StringAdd.java
 * @Description
 * @createTime 2022年04月22日 15:27:00
 */
public class StringAdd {
    public static void main(String[] args) {
        String r = addSum("1232","3232");
         char[] ar =  "12312".toCharArray();
        for (char a : ar
             ) {
            System.out.println(Integer.valueOf(String.valueOf(a)));
        }
        System.out.println(r);
    }

    private static String addSum(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int i = num1.toCharArray().length;
        int j = num2.toCharArray().length;
        // 进位临时变量
        int add = 0;
        while(i>0 || j>0 || add > 0){
            int tem = add;
            if (i>0){
                i--;
                tem =  tem + Integer.valueOf(num1.charAt(i)+"");
            }
            if (j>0){
                j--;
                tem =  tem + Integer.valueOf(num2.charAt(j)+"");
            }
            add = tem/10;
            builder.append(tem%10);
        }
        return builder.reverse().toString();
    }
}
