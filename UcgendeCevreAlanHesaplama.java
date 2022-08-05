package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class UcgendeCevreAlanHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double   sideA, sideB, sideC, circumference, semiCircumference, area;
        System.out.print("\nÜçgen için Çevre ve Alan Hesaplama Programına Hoşgeldiniz\n\n");
        System.out.print("Lütfen çevresini ve alanını hesaplamak istediğiniz üçgenin kenar uzunluklarını cm cinsinden giriniz.\n\n");
        System.out.print("1. Kenar: "); sideA   = inp.nextDouble();
        System.out.print("2. Kenar: "); sideB   = inp.nextDouble();
        System.out.print("3. Kenar: "); sideC   = inp.nextDouble();

        semiCircumference   = (sideA + sideB + sideC) / 2.0;
        circumference       = semiCircumference * 2.0;
        area                = Math.sqrt(semiCircumference * (semiCircumference - sideA) * (semiCircumference - sideB) * (semiCircumference - sideC));

        System.out.print("\nÜçgenin çevresi: " + circumference + "\nÜçgenin alanı: " + area + "\n");
    }
}
