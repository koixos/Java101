package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int     month, day;
        boolean isError = false;
        System.out.print("\nBurç Bulma Programına Hoşgeldiniz!\n\n");
        System.out.print("Kaçıncı ayda doğdunuz?: ");
        month = inp.nextInt();
        System.out.print("Ayın kaçında doğdunuz?: ");
        day = inp.nextInt();

        if (month > 12 || month < 1 || day < 1 || day > 31)
            isError = true;
        else {
            if ((month == 1 && day > 21) || (month == 2 && day <= 19))          System.out.print("\nBurcunuz: KOVA\n");
            else if ((month == 2 && day <= 29) || (month == 3 && day <= 20))    System.out.print("\nBurcunuz: BALIK\n");
            else if (month == 3 || (month == 4 && day <= 20))                   System.out.print("\nBurcunuz: KOÇ\n");
            else if ((month == 4 && day <= 30) || (month == 5 && day <= 21))    System.out.print("\nBurcunuz: BOĞA\n");
            else if (month == 5 || (month == 6 && day <= 22))                   System.out.print("\nBurcunuz: IKIZLER\n");
            else if ((month == 6 && day <= 30) || (month == 7 && day <= 22))    System.out.print("\nBurcunuz: YENGEÇ\n");
            else if (month == 7 || (month == 8 && day <= 22))                   System.out.print("\nBurcunuz: ASLAN\n");
            else if (month == 8 || (month == 9 && day <= 22))                   System.out.print("\nBurcunuz: BAŞAK\n");
            else if ((month == 9 && day <= 30) || (month == 10 && day <= 22))   System.out.print("\nBurcunuz: TERAZI\n");
            else if (month == 10 || (month == 11 && day <= 21))                 System.out.print("\nBurcunuz: AKREP\n");
            else if ((month == 11 && day <= 30) || (month == 12 && day <= 21))  System.out.print("\nBurcunuz: YAY\n");
            else if (month == 1 || month == 12)                                 System.out.print("\nBurcunuz: OĞLAK\n");
            else
                isError = true;
        }
        if (isError)
            System.out.print("\nLütfen geçerli değerler girin.\n");
    }
}
