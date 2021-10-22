package com.company;
//https://nados.pepcoding.com/content/0/6ace02a5-2de9-4c01-80e0-626b252b35ea/
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class TheCuriousCaseOfBenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i*i <=n ; i++) {
            System.out.println("bulb "+ i*i + " is on.");
        }
    }
}
