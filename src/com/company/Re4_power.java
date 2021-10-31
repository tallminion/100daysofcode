package com.company;

import java.util.Scanner;

//https://nados.pepcoding.com/content/0/c7f4bf63-b169-4a9b-8281-9d780357f275/
public class Re4_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int out = power(x,n);
        System.out.print(out);
    }
    static int power(int x, int n){
        if(n == 0) return 1;
        int pnm1 = power(x, n-1);
        int pn = x*pnm1;
        return pn;
    }
}
