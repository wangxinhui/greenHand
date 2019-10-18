package com.basic.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {2, 43, 5, 423, 43, 3, 76, 878765, 1, 67, 4, 3, 4235, 6742, 764,-1};
        System.out.println(Arrays.toString(bubble_sort(a)));
    }

    public static int[] bubble_sort(int[] num) {

        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < num.length - i; j++) {
                int temp = num[j];
                if (num[j] > num[j + 1]) {
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
    }
}
