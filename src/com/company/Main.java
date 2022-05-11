package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int n,x,maxv = 0,minv = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Girmek istediginiz sayı adeti : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println( i+ ". sayıyı giriniz.");
            x = input.nextInt();

            if (x > maxv){
                if (minv == 0){
                    minv = x;
                }
                maxv = x;
            }

            if (x < minv){
                if (maxv == 0){
                    maxv = x;
                }
                minv = x;
            }
        }

        System.out.println("Max Değer : " + maxv);
        System.out.println("Min Değer : " + minv);













    }
}
