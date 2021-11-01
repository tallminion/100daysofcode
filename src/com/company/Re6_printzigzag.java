package com.company;
//https://nados.pepcoding.com/content/0/34355369-9d95-49c8-81a9-36c5c9877701/
import java.util.Scanner;

public class Re6_printzigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    static void print(int n){
        //concept of tree (pre lc in rc post)
        if(n==0)return;
        System.out.print(n);
        print(n-1);
        System.out.print(n);
        print(n-1);
        System.out.print(n);
    }
}
