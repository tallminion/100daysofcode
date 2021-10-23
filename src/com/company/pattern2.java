package com.company;
//https://nados.pepcoding.com/content/0/02a38fd1-44fd-4963-b93d-6b3d95818050/
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}
