//question link
//https://nados.pepcoding.com/content/0/c5cdbc29-2e5e-49dd-8cb8-430675523931/
package com.company;

import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if(marks>90) System.out.println("excellent");
        else if(marks>80&&marks<=90) System.out.println("good");
        else if(marks>70&&marks<=80) System.out.println("fair");
        else if(marks>60&&marks<=70) System.out.println("meets expectations");
        else if(marks<=60) System.out.println("below par");
    }
}
