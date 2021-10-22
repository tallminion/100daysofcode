package com.company;

import java.util.Scanner;

public class primeFactorisationofA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 2; i*i <= num ; i++) {
            while(num%i==0){
                num = num/i;
                System.out.print(i + " ");
            }
        }
        if(num!=1){
            System.out.println(num);
        }
    }
}
