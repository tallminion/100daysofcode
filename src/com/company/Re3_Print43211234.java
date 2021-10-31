package com.company;
//https://nados.pepcoding.com/content/0/c2dbff03-98ef-484f-b8ee-63a11007619c/
import java.util.Scanner;

public class Re3_Print43211234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pdi(n);
    }
    static void pdi(int n){
        if(n==0) return;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
