package Projeler.MayinTarlasiOyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int     row = 0,
                column = 0;
        boolean exit = false;

        System.out.print("===============================================================\n\t\t\t\t\tMAYIN TARLASI\n===============================================================\n--> Oyun alanı için satır ve sütun değerlerini giriniz.\n---------------------------------------------------------------\n");
        do {
            try {
                System.out.print("Satır: ");
                row = inp.nextInt();
                System.out.print("Sütun: ");
                column = inp.nextInt();

                if (row <= 0 || column <= 0)
                    System.out.print("\nLütfen geçerli sınırlar girin.\n");
                else exit = true;
            }
            catch (Exception e) {
                System.out.print("\nLütfen geçerli sınırlar girin.\n");
                inp.nextLine();
            }
            finally { System.out.print("---------------------------------------------------------------\n"); }
        } while (!exit);

        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
    }
}
