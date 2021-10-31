package com.company;
//https://nados.pepcoding.com/content/0/8ed5e886-1ee3-48af-8ec4-580c2fe09da4/
import java.util.Scanner;

public class Re5_powerLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int out = power(x,n);
        System.out.print(out);
    }
    static int power(int x, int n){
        if(n == 0) return 1;
        int pnb2 = power(x,n/2);
        int pn = pnb2*pnb2;
        if(n%2==1){
             pn = pn*x;
        }
        return pn;
    }
}
