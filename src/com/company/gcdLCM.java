package com.company;

import java.util.Scanner;

public class gcdLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int org1 = a;
        int org2 = b;
        while(a%b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        int gcd = b;
        int lcm = (org1*org2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
