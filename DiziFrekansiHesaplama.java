package Diziler;

import java.util.*;

public class DiziFrekansiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\nDizi Frekansını Hesaplama\n\nDizinin eleman sayısı: ");
        int     sizeOfArr = inp.nextInt();
        int[]   arr = new int[sizeOfArr];
        for (int i = 0; i < sizeOfArr; i++) {
            System.out.print(i+1 + ". eleman: ");
            arr[i] = inp.nextInt();
        } System.out.print("\n");

        int[]   memArrInd = new int[sizeOfArr],
                flag = new int[sizeOfArr];
        for (int i = 0; i < sizeOfArr; i++) {
            int sum = 1;
            for (int j = i+1; j < sizeOfArr; j++) {
                if (arr[i] == arr[j]) {
                    ++sum;
                    flag[j] = 1;
                }
            }
            memArrInd[i] = sum;
        }
        for (int i = 0; i < sizeOfArr; i++)
            if (flag[i] != 1)
                System.out.print(arr[i] + " sayısı " + memArrInd[i] + " kez tekrar etti.\n");
    }
}
