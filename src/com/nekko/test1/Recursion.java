package com.nekko.test1;

public class Recursion {
    public static void main(String[] args) {
        int result = test(5);
        System.out.println(result);
    }

    private static int test(int i) {
        if (i == 1){
            return 1;
        }else {
            return test(i - 1) * i;
        }
    }
}
