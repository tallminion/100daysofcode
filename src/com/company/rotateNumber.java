package com.company;

import java.util.Scanner;

//https://nados.pepcoding.com/content/0/9c36d490-8902-4485-9c31-0ee51b435162/
public class rotateNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = in.nextInt();

        //count number of digits
        int count = 0;
        int temp = num;
        while(temp>0){
            temp/=10;
            count++;
        }

        //calculate the divider and multiplier
        int div = 1;
        int mul =1;
        for(int i=1; i<=count; i++){
            if(i<=n){
                div=div*10;
            }
            else {
                mul = mul * 10;
            }
        }

        int quo = num/div;
        int rem = num%div;

        int result = rem*mul+quo;
        System.out.println(result);
    }
}
