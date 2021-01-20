package com.sumer;

public class Demo {
    public static void main(String[] args){

        //作业
        System.out.println("作业test01:");
        test01();

        System.out.println("-----------------------------");
        System.out.println("作业test02:");
        test02();

        System.out.println("-----------------------------");
        System.out.println("作业test03:");
        test03();

        System.out.println("-----------------------------");
        System.out.println("作业test04:");
        test04();

        System.out.println("-----------------------------");
        System.out.println("作业test05:");
        test05();

        System.out.println("-----------------------------");
        System.out.println("作业test06:");
        test06();

    }


    /**
     * parms 需要判断类型的对象
     * return 对象类型
     * */
    public static Object getType(Object o){
        return o.getClass().getName();
    }


    //作业----------------------------------------------------------------------
    public static void test01(){
        System.out.println("hello" + "world");
    }

    public static void test02(){
        System.out.println("我的姓名是: " + "夏天");
        System.out.println("我的性别是: " + '男');
        System.out.println("我的年龄是: " + 24);
        System.out.println("我的身高是: " + 180.1);
        System.out.println("是否已婚: " + false);
    }

    public static void test03(){
        //字节类型
        char c = '中';
        //数值byte类型(数值 存储最大值为127)
        byte b = 127;
        //数值short类型(数值 存储最大值为32767)
        short s = 32767;
        //数值int类型(数值 存储最大值为2147483647)
        int i = 2147483647;
        //数值long类型
        long l = 9223372036854775807L;//因为java默认数值类型是int 所以需要在结尾加L强转为long类型  用(long)是转不了的  必须在结尾加L

        //单精度浮点型
        float f = (float) 123.123;//因为java默认小数是double类型 所以需要强转为float类型
        //双精度浮点型
        double d = 124.23;

        //布尔类型
        boolean t = true;

        //null
        String n = null;

        //判断对象的类型
        System.out.println(c + "的类型是: " + getType(c));
        System.out.println(b + "的类型是: " + getType(b));
        System.out.println(s + "的类型是: " + getType(s));
        System.out.println(i + "的类型是: " + getType(i));
        System.out.println(l + "的类型是: " + getType(l));
        System.out.println(f + "的类型是: " + getType(f));
        System.out.println(t + "的类型是: " + getType(t));
        // System.out.println(n + "的类型是: " + getType(n));

    }


    public static void test04(){
        //数量
        int number = 100;
        //金额
        double amount = 99.98;
        //年龄
        long age = 2000000000L;


        System.out.println("班里有" + number + "个学生");
        System.out.println("iPhone价格是: " + number);
        System.out.println("班里有" + number + "个学生");
        System.out.println("地球有超过" + age + "年的历史");
        System.out.println(5 + "是双数这句话是" + false);
    }

    public static void test05() {
        int birth = 1996;
        int now = 2021;
        int age = now - birth;
        System.out.println("我的年龄是: " + age);
    }


    public static void test06() {

        String name = "夏天";
        char sex = '男';
        byte age = 24;
        String address = "深圳市福田区华强北街道";
        double price = 30000000.21;

        System.out.println("我的姓名是: " + name);
        System.out.println("我的年龄是: " + age);
        System.out.println("我的住址是: " + address);
        System.out.println("我的资产是: " + price);
    }
}
