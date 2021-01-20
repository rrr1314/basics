package com.sumer;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月18日 09:24:00
 */
public class Demo {
    public static void main(String[] args) {

        test03();


    }


    public static void test01() {

        int[]arrint = new int[10];

        arrint[9] = 123;



        double[] arrdouble = new double[20];


        char[] arrchar = new char[10];

        arrchar[2] = ' ';

        arrdouble[13] = 24;

        System.out.println(arrint[9]);
        System.out.println(arrdouble[13]);
        System.out.println(arrchar[2]);
    }

    public static void test02(){


        double[] abc = {123,124,412};

        String[] str = {"哈哈哈", "呵呵呵", "嘿嘿嘿"};


        System.out.println(abc[0]);

        System.out.println(str[2]);


        int[] in = {1,2,3};

        System.out.println(in[0]);


        ;
    }

    public static void test03(){


        int[]  in = {2,3,4,5,610,20,35,1,24};

        int max = in[0];
        int mas = in[0];
        int sum = 0;

        for (int i = 1; i<in.length; i++){


            if (in[i] > max){
                //最大
                max = in[i];
            }else  if(in[i] < mas){
                //最小
                mas = in[i];
            }
        }
        System.out.println("最大值是: " + max);
        System.out.println("最小值为: " + mas);


        for (int i =1; i<in.length; i++){
            if (in[i] == max  || in[i] == mas){

            }else{
                sum += in[i];
            }
        }
        System.out.println("平均值是: "+ sum);
    }
}
