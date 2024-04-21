package uts_praktikum;

import java.util.Scanner;

public class no2_patternC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris - i; j++) {
                System.out.print("  ");
            } 
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
