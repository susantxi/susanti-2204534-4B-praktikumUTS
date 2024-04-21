package uts_praktikum;

import java.util.Scanner;

public class no1_cekPalindrom {
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        
        System.out.print("Masukkan tiga digit integer : ");
        int bil = bilangan.nextInt();
        
        int temp = bil;
        int sum = 0;
        
        if (bil >= 100 && bil < 1000) {
            while (bil > 0) {
                int a = bil % 10; 
                sum = (sum * 10) + a;
                bil = bil / 10;
            }

            if(temp == sum){
                System.out.println(temp + " adalah palindrom");
            }else{
                System.out.println(temp + " bukan palindrom");
            }
        } else {
            System.out.println("Bilangan yang dimasukkan harus tiga digit integer");
        }
       
        bilangan.close();
    }
}
