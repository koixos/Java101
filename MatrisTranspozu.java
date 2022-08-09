package Diziler;

import java.util.*;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int     row, column;
        System.out.print("\n===============================\n\tMATRIS TRANSPOZUNU BULMA\n===============================\nMatrisin boyutları: \n-------------------------------\n");
        System.out.print("Satır: ");    row = inp.nextInt();
        System.out.print("Sütun: ");    column = inp.nextInt();

        int[][] arr = new int[row][column],
                transposedArr = new int[column][row];
        System.out.print("\nElemanları giriniz: \n-------------------------------\n");

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                arr[i][j] = inp.nextInt();

        for (int j = 0; j < column; j++)
            for (int i = 0; i < row; i++)
                transposedArr[j][i] = arr[i][j];

        System.out.print("--------------------------------\n\t\t\tMatris\n--------------------------------\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.print("\n");
        }
        System.out.print("--------------------------------\n\t\t\tTranspoze\n--------------------------------\n");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++)
                System.out.print(transposedArr[i][j] + "\t");
            System.out.print("\n");
        }
    }
}
