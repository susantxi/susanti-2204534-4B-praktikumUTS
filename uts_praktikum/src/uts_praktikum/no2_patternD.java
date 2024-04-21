package uts_praktikum;

import java.util.Scanner;

public class no2_patternD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        
        for (int i = baris; i >= 1; i--) {
            for (int j = baris - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            } 
            System.out.println();
        }
        System.out.println();
    }
}
