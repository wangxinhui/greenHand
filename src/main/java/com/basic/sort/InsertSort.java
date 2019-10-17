package com.basic.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] a = {2,43,5,423,43,3,76,878765};
        System.out.println(Arrays.toString(insert_sort(a)));
    }


    public static int[] insert_sort(int[] n){
        for (int i = 1; i < n.length; i++) {
            int tmp = n[i];
            for (int j = i; j >0 && tmp < n[j-1]  ; j--) {
                n[j] = n[j-1];
                n[j-1]= tmp;
            }
        }
        return n;
    }
}
