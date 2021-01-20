package com.sumer;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月15日 08:59:00
 */
public class Test {

    public static void main(String[] args) {

        int heshan1 = 150;
        int heshan2 = 210;
        int heshan3 = 165;

        int max = heshan1 > heshan2 ? heshan1 : heshan2;
        int mmax = max > heshan3 ? max : heshan3;
        System.out.println("最大值为: " + mmax);

    }


    public static String getType(Object o){ //获取变量类型方法
        //使用int类型的getClass()方法
        return o.getClass().getName();
    }
}
