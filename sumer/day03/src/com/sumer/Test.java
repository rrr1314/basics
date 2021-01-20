package com.sumer;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月17日 09:54:00
 */
public class Test {

    public static void main(final String[] args) {
        // test01();
        test18();

    }

    public static void test01() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void test02() {

        for (int i = 10000; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void test03() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void test04() {
        final int i = 123456789;

        final int k = i / 100000000;

        if (k % 2 != 0) {
            System.out.println("1" + "是单数");

            System.out.println(k + "是单数");
        }

        System.out.println(k);
    }

    public static void test05() {
        final int i = 123456789;

        final int k = i % 10;

        final int l = i / 1000;

        final int o = l % 10;

        System.out.println(l);
    }

    // 统计 100 - 999 水仙花个数

    public static void test06() {

        int count = 0;

        int s = 1;
        while (s <= 100) {
            System.out.println("s: " + s);
            s++;
        }

        for (int i = 100; i < 1000; i++) {

            final int ge = i % 10;
            final int shi = i / 10 % 10;
            final int bai = i / 10 / 10 % 10;

            if ((ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai) == i) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("水仙花个数共有: " + count);

    }

    public static void test07() {

        int i = 1;

        do {
            System.out.println(i);

            i++;
        } while (i < 10);
    }

    public static void test08() {
        for (;;) {
            System.out.println("for");
        }
    }

    public static void test09() {

        while (true) {
            System.out.println("while");
        }
    }

    public static void test10() {
        do {
            System.out.println("do循环");
        } while (true);
    }

    public static void test11() {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void test12() {
        for (int i = 1; i <= 9; i++) {
            // System.out.println(i);
            for (int j = 1; j <= i; j++) {
                // System.out.println(i);
                System.out.print(j + "X" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }

    public static void test13() {

        final String str = "*";

        for (int i = 1; i < 10; i++) {

            for (int j = 9; j >= i; j--) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public static void test14() {

        final int zhu = 2019;

        for (int i = 1949; i <= 2019; i++) {

            if ((2019 - i) % 12 == 0) {

                System.out.println(i);
            }
        }
    }

    public static void test15() {
        final String str = "@";
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public static void test16() {
        final String str = "@";

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public static void test17() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "X" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }

        final int ss = 12;

        switch (ss) {
            case 12:
                System.out.println("!23");
                break;
            default:
                System.out.println("456");
        }
    }

    public static void test18() {

        for (int x = 0; x != 10; x += 0.1) {

            System.out.println("123");
        }

    }

    public static void test19() {

        for (int i = 1; i < 10; i++) {
            // System.out.println("换1元硬币1张, " + "5角硬币" + );
        }
    }

}
