package Diziler;

import java.util.Scanner;
import java.util.Arrays;

public class TekrarlayanCiftSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int     sizeofArr;
        System.out.print("\nTekrarlayan Çift Sayıları Belirleme\n\nDizinin eleman sayısı: ");
        sizeofArr = inp.nextInt();

        int[]   arr = new int[sizeofArr],
                temp = new int[sizeofArr];
        for (int i = 0; i < sizeofArr; i++) {
            System.out.print(i+1 + ". eleman: ");
            arr[i] = inp.nextInt();
        }
        for (int i = 0; i < sizeofArr; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i+1; j < sizeofArr; j++) {
                    if (arr[j] == arr[i]) {
                        temp[j] = arr[j];
                        temp[i] = arr[i];
                    }
                }
            }
        }
        System.out.print("\n" + Arrays.toString(temp) + "\n");
    }
}
