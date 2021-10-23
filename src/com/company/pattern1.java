package com.company;
//https://nados.pepcoding.com/content/0/575b991c-bb20-49f0-ae63-f4bff9dc5c54/
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}
