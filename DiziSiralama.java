package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void sortArr(int[] arr, int headIndex, int size) {
        int     temp = arr[headIndex],
                tempIndex = headIndex;

        if (headIndex == size-1)
            return;
        for (int i = headIndex; i < size; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
                tempIndex = i;
            }
        }
        arr[tempIndex] = arr[headIndex];
        arr[headIndex] = temp;

        sortArr(arr, ++headIndex, size);
    } /* END OF sortArr */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\nDizi Sıralama\n\nDizinin eleman sayısı: ");
        int     sizeOfArr = inp.nextInt();

        int[]   arr = new int[sizeOfArr];
        for (int i = 0; i < sizeOfArr; i++) {
            System.out.print(i+1 + ". eleman: ");
            arr[i] = inp.nextInt();
        }
        sortArr(arr, 0, sizeOfArr);

        System.out.print("\nSıralı dizi: " + Arrays.toString(arr) + "\n");
    }
}