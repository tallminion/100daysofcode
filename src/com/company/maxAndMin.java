package com.company;
//You are given an array A of n unique integers.
//        You have to find 2nd maximum and 2nd minimum numbers in this array.
//
//        If A = [3, 7, -1, 2, 4, 9]
//
//        2nd max is 7
//        2nd min is 2


import java.util.Arrays;
import java.util.Scanner;

//https://nados.pepcoding.com/content/0/c5126b22-4e4c-4aac-b2e4-c5364c225ff8/
public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
//        take input from user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//      bubble  sort
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }

        System.out.print(arr[1]);
        System.out.print(" "+arr[n-2]);
    }
}
