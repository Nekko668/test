package com.nekko.test1;

import java.io.File;
import java.util.HashMap;
// test edit

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,6,67,333,356,378,445,678};
        int num = 378;

       //int index = binarySearch(arr, num);
       int count = binarySearchForCount(arr, num);
        //System.out.println(index);
        System.out.println(count);
    }


    // 二分查找 找不到返回-1
    private static int binarySearch(int[] arr, int num) {
        int min = 0, max = arr.length - 1, mid;
        while (min <= max){
            mid = (min + max) >> 1;
            if (arr[mid] == num) {
                return mid;
            }else if (arr[mid] > num) {
                max = mid - 1;
            }else {
                min = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearchForCount(int[] arr, int num) {
        int min = 0, max = arr.length - 1, mid, count = 0;
        while (min <= max){
            mid = (min + max) >> 1;
            if (arr[mid] == num) {
                return ++count;
            }else if (arr[mid] > num) {
                max = mid - 1;
            }else {
                min = mid + 1;
            }
            count++;
        }
        return count;
    }


}
