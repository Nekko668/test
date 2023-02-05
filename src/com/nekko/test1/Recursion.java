package com.nekko.test1;

public class Recursion {
    public static void main(String[] args) {
        int result = test(5);
        System.out.println(result);
        System.out.println("测试提交");
        System.out.println("测试提交2");
        System.out.println("测试提交3");
    }

    private static int test(int i) {
        if (i == 1){
            return 1;
        }else {
            return test(i - 1) * i;
        }
    }
}
