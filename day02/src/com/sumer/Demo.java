package com.sumer;

import java.util.Scanner;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月15日 18:59:00
 */
public class Demo {

    // 最低存款金额
    public static int zuidi = 1000;
    // 最大存款年限
    public static int zuidaqixian = 5;
    // 最小存款年限
    public static int zuixiaoqixian = 1;

    public static void main(final String[] args) {

        // 作业
        // test01();
        // test02();
        // test03();

        test05();
    }

    public static void test01() {
        // 新手机价格
        final int iphone = 7988;
        // 旧手机价格
        final int jiushoujij = 1500;
        // 以旧换新
        final int dazhe = (int)(iphone * 0.8);
        // 卖掉旧手机买新手机
        final int payment = iphone - jiushoujij;

        if (dazhe < payment) {
            System.out.println("以旧换新更划算, 因为以旧换新的价格是: " + dazhe + "卖掉旧手机再买新手机的价格是: " + payment);
        } else {
            System.out.println("卖掉旧手机再买新手机更划算, 因为卖掉旧手机再买新手机的价格是: " + dazhe + "以旧换新的价格是: " + payment);
        }
    }

    public static void test02() {

        final Scanner sc = new Scanner(System.in);

        // 比较的数字1
        System.out.println("请输入需要比较的数字1:");
        final int a = sc.nextInt();

        System.out.println("请输入需要比较的数字2:");
        final int b = sc.nextInt();

        System.out.println("请输入需要比较的数字3:");
        final int c = sc.nextInt();

        final int max = a > b ? a : b;

        if (max > c) {
            System.out.println("最大的数是: " + max);
        } else {
            System.out.println("最大的数是: " + c);
        }
    }

    public static void test03() {

        final Scanner st = new Scanner(System.in);
        System.out.println("请输入你要存储的金额:");
        final double amount = st.nextInt();

        if (amount < zuidi) {
            System.out.println("不好意思, 我们最低存款金额为: " + zuidi);
        } else {
            System.out.println("请输入你的存款期限:");
            final int qixian = st.nextInt();

            if (qixian > zuidaqixian) {
                System.out.println("非常抱歉, 存款期限最大为: " + zuidaqixian + "年");
            } else if (qixian < zuixiaoqixian) {
                System.out.println("非常抱歉, 存款期限最小为: " + zuixiaoqixian + "年");
            }

            if (qixian == 1) {
                System.out.println("您好, 您存入的年限为1年, 本息共: " + (amount + (amount * 1 * 0.00225)));
            } else if (qixian == 2) {
                System.out.println("您好, 您存入的年限为2年, 本息共: " + (amount + (amount * 2 * 0.0027)));
            } else if (qixian == 3) {
                System.out.println("您好, 您存入的年限为3年, 本息共: " + (amount + (amount * 3 * 0.00325)));
            } else if (qixian == 4) {
                System.out.println("非常抱歉, 存款期限不允许4年");
            } else if (qixian == 5) {
                System.out.println("您好, 您存入的年限为5年, 本息共: " + (amount + (amount * 5 * 0.0036)));
            }
        }
    }

    public static void test04() {

        System.out.println("如果你是会员请输入1, 否则请输入0");

        final Scanner sc = new Scanner(System.in);

        final int info = sc.nextInt();

        if (info == 1) {
            // 会员
            System.out.println("亲爱的会员您好, 请输入您的购物金额:");
            final int amount = sc.nextInt();
            if (amount > 1 && amount < 200) {
                System.out.println("您需要支付: " + amount * 0.8 + "元");
            } else if (amount > 200) {
                System.out.println("您需要支付: " + amount * 0.75 + "元");
            } else {
                System.out.println("您的输入有误!");
            }
        } else if (info == 0) {
            // 非会员
            System.out.println("请输入您的购物金额:");
            final int amount = sc.nextInt();
            if (amount > 1 && amount < 100) {
                System.out.println("您需要支付: " + amount + "元");
            } else if (amount > 100) {
                System.out.println("您需要支付: " + amount * 0.9 + "元");
            } else {
                System.out.println("您的输入有误!");
            }
        } else {
            System.out.println("您的输入有误!");
        }
    }

    public static void test05() {

        System.out.println("请输入您的睡前工资: ");

        final Scanner info = new Scanner(System.in);

        final double st = info.nextDouble();

        if (st > 1) {

            System.out.println("我输入的金额是 " + st);
            final double s = st - (st * 0.1);
            System.out.println("扣掉三险一金是 " + s);

            if (s > 5000) {
                // 交税
                final double q = s - 5000;

                System.out.println("大于5000的部分 " + q);
                if (q <= 3000) {

                    final int k = (int)(q * 0.03);

                    System.out.println("您需要缴纳: " + k + "您的薪资为: " + (s - (q * 0.03)));
                } else if (q > 3000 && q <= 12000) {

                    final double i = q - 3000;

                    final int g = (int)(3000 * 0.03);
                    final int h = (int)(i * 0.1);
                    final int m = g + h;

                    System.out.println("您需要缴纳: " + m + "您的薪资为: " + (s - m));
                } else if (q > 12000 && q <= 25000) {

                    final int i = (int)(q - 3000);
                    final int o = (int)(i - 9000);

                    final int g = (int)(3000 * 0.03);
                    final int j = (int)(9000 * 0.1);
                    final int k = (int)(o * 0.2);

                    final int m = g + j + k;
                    System.out.println("您需要缴纳: " + m + "您的薪资为: " + (s - m));

                    System.out.println("您需要缴纳: " + ((3000 * 0.3) - ((q - 3000) * 0.2)) + "您的薪资为: " + (s - (q * 0.2)));
                } else if (q > 25000 && q <= 35000) {
                    System.out.println("您需要缴纳: " + ((3000 * 0.3) - ((q - 3000) * 0.2)) + "您的薪资为: " + (s - (q * 0.2)));
                    System.out.println("您需要缴纳: " + (st * 0.25) + "您的薪资为: " + (s - (st * 0.25)));
                } else if (q > 35000 && q <= 55000) {
                    System.out.println("您需要缴纳: " + (st * 0.30) + "您的薪资为: " + (s - (st * 0.30)));
                } else if (q > 55000 && q <= 80000) {
                    System.out.println("您需要缴纳: " + (st * 0.35) + "您的薪资为: " + (s - (st * 0.35)));
                } else if (q > 80000) {
                    System.out.println("您需要缴纳: " + (st * 0.45) + "您的薪资为: " + (s - (st * 0.45)));
                }
            } else {
                // 不需要交税
                System.out.println("您不需要交税, 您的薪资为: " + s);
            }
        } else {
            System.out.println("您的输入有误!");
        }
    }
}
