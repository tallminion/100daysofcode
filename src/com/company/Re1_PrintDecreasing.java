package com.company;
//https://nados.pepcoding.com/content/0/98ea0545-82ee-40c4-b312-dca65c04c60d/
import java.util.Scanner;

public class Re1_PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
