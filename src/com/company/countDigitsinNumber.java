package com.company;
//https://nados.pepcoding.com/content/0/b3803d1e-4e6d-47d9-9268-3ef9c86c0506/

import java.util.Scanner;

public class countDigitsinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
