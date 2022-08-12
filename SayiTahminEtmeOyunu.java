package Projeler;

import java.util.*;
import java.lang.Math;

public class SayiTahminEtmeOyunu {
    static Scanner  inp = new Scanner(System.in);
    static int      totalRight = 5;

    static int      createRandomNumber() {
        return (int) (Math.random() * 101);
    }
    public static void main(String[] args) {
        int         randomNum = createRandomNumber(),
                    remainedRight = totalRight,
                    guess;
        int[]       guessedNumbers = new int[totalRight];
        System.out.print("\n================================================\n\t\t\tSAYI TAHMIN ETME OYUNU\n================================================\n0-100 aralığında bir sayı tahmin ediniz.\nToplam tahmin hakkınız: " + totalRight + "\n");

        do {
            System.out.print("-------------------------------------------------\nTahmininiz: ");
            guess = inp.nextInt();
            guessedNumbers[totalRight-remainedRight] = guess;
            if (guess < 0 || guess > 100)
                System.out.print("\nLütfen 0-100 aralığında bir değer giriniz.\n");
            else {
                --remainedRight;
                if (guess == randomNum) {
                    System.out.print("================================================\nTebrikler! Kazandınız :)\n");
                    break;
                }
                System.out.print("\nYanlış tahmin! ");
                if (guess < randomNum) System.out.print("Tahmininiz gizli sayıdan küçük.\n");
                else System.out.print("Tahmininiz gizli sayıdan büyük.\n");
                System.out.print("\nKalan tahmin hakkınız: " + remainedRight + "\n");
            }
        } while (remainedRight > 0);

        if (guess != randomNum)
            System.out.print("================================================\nKaybettiniz!\nGizli sayı: " + randomNum + "\nTahminleriniz: " + Arrays.toString(guessedNumbers) + "\n");
        System.out.print("================================================\n");
    }
}
