package com.wudi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        int[] data = {2, 0, 5, 4, 7, 9, 3, 6, 1, 10, 8};
        //maopao(data);
        //insertSort(data);
        shellSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    /**
     * 冒泡排序最好情况时间复杂度为O（n），最坏情况为 O(n^2)；
     *ٛ  冒泡排序稳定
     * 冒泡排序空间复杂度为O（1）
     */
    public static void maopao(int[] data) {
        int a = 0;
        if (data.length == 0) {
            return;
        } else {
            for (int i = 0; i < data.length; i++) {
                boolean flag = false;
                for (int j = 0; j < data.length - 1 - i; j++) {
                    if (data[j] > data[j + 1]) {
                        a = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = a;
                        flag = true;
                    }
                }
                if (!flag) {
                    break;
                }
            }
        }
    }

    /**
     * 空间复杂度为O（1）
     * 稳定排序
     * 时间复杂度最好为O（n），平均为O（n^2）
     */
    public static void insertSort(int[] array) {
        if (array==null||array.length<= 1) {
            return;
        } else {
            int n = array.length;
            for (int i = 1; i < n; i++) {
                int value = array[i];
                int j = i - 1;
                for (; j >= 0; j--) {
                    if (array[j] > value) {
                        array[j + 1] = array[j];
                    } else {
                        break;
                    }
                }
                array[j + 1] = value;
            }
        }
    }
    //希尔排序是非稳定排序
    public static void shellSort(int[] data){
        int n=data.length;
        if(data!=null && n<=1){
            return;
        }
        int step=n/2;
        while (step>=1){
            for(int i=step;i<n;i++){
                int value=data[i];
                int j=i-step;
                for (;j>=0;j=j-step){
                    if(data[j]>value) {
                        data[j + step] = data[j];
                    }else {
                        break;
                    }
                }
                data[j+step]=value;
            }
            step=step/2;
        }
    }
    //快排
}