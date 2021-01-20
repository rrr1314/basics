package com.sumer;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月14日 10:46:00
 */
public class Test {
    public static void main(String[] args) {
        double a = 123;


        String b = "100F";
        System.out.println(getType(a));
    }


    public static String getType(Object o){ //获取变量类型方法
        //使用int类型的getClass()方法
        return o.getClass().getName();
    }
}
