package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double  height, weight, bmi;
        System.out.print("\nVücut Kitle Endeksi Hesaplama Programına Hoşgeldiniz\n\n");
        System.out.print("Lütfen boyunuzu ve kilonuzu m ve kg cinsinden giriniz.\n\n");
        System.out.print("Boy (örn: 1.72): ");  height  = inp.nextDouble();
        System.out.print("Kilo (örn: 82) : ");  weight  = inp.nextDouble();

        bmi = weight / (height * height);
        System.out.print("Vücut Kitle Endeksiniz: " + bmi + "\n");
    }
}
