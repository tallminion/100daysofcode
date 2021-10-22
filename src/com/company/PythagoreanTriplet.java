package com.company;

import java.util.Scanner;

//https://nados.pepcoding.com/content/0/7d29eb24-058d-414c-a9a4-a4df4f1adb17/
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(b>=max){
            max=b;
        }
        if(c>=max){
            max=c;
        }
        if(max==a){
            boolean flag = ((b*b+c*c)==a*a);
            System.out.println(flag);
        }else if(max==b){
            boolean flag = ((a*a+c*c)==b*b);
            System.out.println(flag);
        }else{
            boolean flag = ((a*a+b*b)==c*c);
            System.out.println(flag);
        }
    }
}
