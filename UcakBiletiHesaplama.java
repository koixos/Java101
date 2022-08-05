package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        boolean isInvalid = false;
        int     distance, age, selection;
        double  amount, perKM = 0.1;
        System.out.print("\nUçak Bileti Fiyatlandırma Ekranı\n\n");
        System.out.print("Mesafeyi kilometre cinsinden giriniz: ");
        distance = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();
        System.out.print("Yolculuk tipini seçiniz [ 1) Tek Yön / 2) Gidiş-Dönüş ] : ");
        selection = inp.nextInt();

        if (distance < 0 || age < 0 || age > 110 || selection < 1 || selection > 2)
            isInvalid = true;

        if (isInvalid)
            System.out.print("\nLütfen geçerli veriler giriniz.\n");
        else {
            amount = distance * perKM;
            if (age < 12)
                amount -= amount/2.0;
            else if (age <= 24)
                amount -= amount/10.0;
            else if (age > 65)
                amount -= (amount*3.0)/10.0;

            if (selection == 2) {
                amount -= amount / 5.0;
                amount *= 2;
            }
            System.out.print("\nToplam tutar: " + amount + " TL\n");
        }
    }
}
