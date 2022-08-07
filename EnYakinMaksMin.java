package Diziler;

import java.util.Scanner;

public class EnYakinMaksMin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\nEn Yakın Maksimum ve Minimum Değerleri Bulma\n\nDizinin eleman sayısı: ");
        int     sizeOfArr = inp.nextInt();
        int[]   arr = new int[sizeOfArr];
        for (int i = 1; i <= sizeOfArr; i++) {
            System.out.print(i + ". eleman: ");
            arr[i-1] = inp.nextInt();
        }
        System.out.print("\nReferans değer: ");
        int     value = inp.nextInt(),
                tempMin = -999,
                tempMax = 999;
        boolean flagMin = false,
                flagMax = false;
        for (int i = 0; i < sizeOfArr; i++) {
            if (arr[i] <= value) {
                if (arr[i] >= tempMin)
                    tempMin = arr[i];
                flagMin = true;
            }
            else {
                if (arr[i] <= tempMax)
                    tempMax = arr[i];
                flagMax = true;
            }
        }
        if (flagMin)  System.out.print("\nEn yakın minimum değer: " + tempMin);
        else System.out.print("\nEn yakın minimum değer bulunamadı.\n");
        if (flagMax) System.out.print("\nEn yakın maksimum değer: " + tempMax + "\n");
        else System.out.print("\nEn yakın maksimum değer bulunamadı.\n");
    }
}
