package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int year;
        System.out.print("\nArtık Yıl Mı?\n\n");
        System.out.print("Artık yıl olup olmadığını öğrenmek istediğiniz yılı giriniz.\n");
        System.out.print("Yıl: ");  year = inp.nextInt();

        if (year % 100 != 0 && year % 4 == 0)
            System.out.print("\n>> " + year + " artık yıldır.\n");
        else if (year % 100 == 0 && year % 400 == 0)
            System.out.print("\n>> " + year + " artık yıldır.\n");
        else
            System.out.print("\n>> " + year + " artık yıl değildir.\n");
    }
}
