package com.myarray;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int temp;
        int length = arr1.length; // 5
        temp=arr1[0];
        arr1[0]= arr1[length-1];
        arr1[length-1]=temp;
        System.out.println(arr1[0]); //5
        System.out.println(arr1[length/2]); //3
        System.out.println(arr1[0]+arr1[length/2]); //8

    }
}
