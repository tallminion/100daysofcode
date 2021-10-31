package com.company;
//https://nados.pepcoding.com/content/0/86270318-8803-487a-b5e5-1d05a45d0113/
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space =0;
        int star =n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("#");
            }
//            System.out.println(space+ " " +star);
            space++;
            star--;
            System.out.println();
        }
    }
}
