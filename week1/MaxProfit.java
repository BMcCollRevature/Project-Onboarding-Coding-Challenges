package com.po.week1;

import java.util.Collections;

public class MaxProfit {

    public static int getMaxProfit(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }
    public static void main(String[] args) {
        int array[] ={14, 12, 70, 15, 99, 65, 21, 90};
        System.out.println("The max profit is " + getMaxProfit(array));
    }
}
