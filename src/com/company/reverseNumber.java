package com.company;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum = sum*10+rem;
        }
        System.out.println(sum);

    }
}
