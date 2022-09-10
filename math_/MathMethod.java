package com.zljava.math_;

/**
 * @author 赵浪
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
//        Math.ceil(5.6);
//        int a;
        int a = (int)(2 + Math.random() * 7);
        System.out.println(a);
        System.out.println(Math.max(2, 4));
        System.out.println(Math.min(2, 5));
        String s = "dhf";
        int age = 12;
        String s1 = String.format("姓名是%s年龄是%d",s,age);
        System.out.println(s1);
//        int a = ((int) Math.random() * 3);
//        int b = ((int) Math.random() * 8);
//        System.out.println(method(2,4));
    }
//    public static int method(int a, int b) {
//       while (true) {
//           int res = ((int) Math.random() * b) + 1;
//           if ( a <= res && res <= b) {
//               return res;
//           }
//       }
//    }
}
