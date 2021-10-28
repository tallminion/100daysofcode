package com.company;
//https://nados.pepcoding.com/content/0/13be68bd-68ff-4363-a3cc-9d49e8f5ca8e/
import java.util.Scanner;

public class Re1_PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(n);
    }
    public static void count(int n){
        if(n==0) return;
        count(n-1);
        System.out.println(n);
    }
}
