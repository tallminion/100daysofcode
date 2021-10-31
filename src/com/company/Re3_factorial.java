package com.company;
//https://nados.pepcoding.com/content/0/2610d2ba-0b44-4faf-8a58-5d7bafe88564/
import java.util.Scanner;

public class Re3_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial =  factorial(n);
        System.out.println(factorial);
    }
    static int factorial(int n){
        if(n==1) return 1;
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;
    }
}
