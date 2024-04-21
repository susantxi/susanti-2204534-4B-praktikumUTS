package uts_praktikum;

import java.util.Scanner;

public class no3_integerPalindrom {
    public static int reverse(int number) {
        int sum = 0;
        while (number > 0) {
            int a = number % 10;
            sum = sum * 10 + a;
            number = number /10;
        }
        return sum;
    }
    
    public static boolean isPalindrome(int number) {
        int sum = reverse(number);
        return number == sum;
    }

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int number = bilangan.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " adalah bilangan palindrom.");
        } else {
            System.out.println(number + " bukan bilangan palindrom.");
        }
        bilangan.close();
    }
}
