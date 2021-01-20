package com.sumer;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月20日 09:05:00
 */
public class Demo {

    public static void main(final String[] args) {

        // int number1 = 10;
        // int number2 = 20;
        // getMax(number1, number2);
        //
        // String abc = isDouble(12,13,"尼玛");
        //
        //
        //
        // System.out.println(abc);

        final int is = 123;

        final int[] array = {1, 2, 3, 4, 5, 12, 13};

        final String str = Demo.test06(array);

        System.out.println(str);
    }

    private static String isDouble(final int i, final int i1, final String abc) {

        return "abc";
    }

    public static void test01(final int age) {

        System.out.println("我的年龄是: " + age);

    }

    public static void getMax(final int number1, final int number2) {

        System.out.println("最大值是: " + (number1 > number2 ? number1 : number2));
    }

    public static void test03() {
        for (int i = 0; i < 10; i++) {
            System.out.println("123");
        }
    }

    public static void test04(final int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("123");
        }
    }

    // 方法重载(就是方法名相同 但是传入参数不同 根据传入的参数 选择对应的方法)
    public static boolean test05(final int num1, final int num2) {
        System.out.println("int");
        return num1 == num2;
    }

    public static boolean test05(final byte num1, final byte num2) {
        System.out.println("byte");
        return num1 == num2;
    }

    public static boolean test05(final short num1, final short num2) {
        System.out.println("short");
        return num1 == num2;
    }

    public static boolean test05(final long num1, final long num2) {
        System.out.println("long");
        return num1 == num2;
    }

    public static boolean test05(final double num1, final double num2) {
        System.out.println("double");
        System.out.println(num1);
        System.out.println(num2);
        return num1 == num2;
    }

    public static boolean test05(final float num1, final float num2) {
        System.out.println("float");
        return num1 == num2;
    }

    public static int[] test05(final int[] arr) {
        arr[0] = 12;
        return arr;
    }

    private static String test06(final int[] arr) {

        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            } else {
                str += arr[i] + ", ";
            }
        }
        return str;
    }
}
