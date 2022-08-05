package Metotlar;
import java.util.Scanner;

public class RecursiveAsalMi {
    static int recursiveAsalMi(int number, int divider) {
        if (divider == number)
            return 1;
        if (number % divider != 0)
            return recursiveAsalMi(number, ++divider);
        return -999;
    } /* END OF recursiveAsalMi */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int     number = -999, flag;
        boolean exit = false;
        while(!exit) {
            System.out.print("\nAsal Mı?\n\nSayı: ");
            number = inp.nextInt();

            if (number < 2)
                System.out.print("\nLütfen 2'den büyük bir doğal sayı giriniz.\n");
            else exit = true;
        }
        flag = recursiveAsalMi(number, 2);
        if (flag == 1) System.out.print("\n" + number + " asaldır.\n");
        else if (flag == -999) System.out.print("\n" + number + " asal değildir.\n");
    }
}
