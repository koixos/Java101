package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double  amount_of_money, tax_rate, total_amount;
        System.out.print("\nKDV Tutarı Hesaplama Programına Hoşgeldiniz\n\n");
        System.out.print("Lütfen KDV'sini hesaplamak istediğiniz tutarı giriniz: ");
        amount_of_money = inp.nextDouble();

        tax_rate = amount_of_money <= 1000.0 ? 0.18 : 0.08;

        total_amount = amount_of_money + (amount_of_money * tax_rate);

        System.out.println("KDV'siz fiyat: " + amount_of_money);
        System.out.println("KDV'li fiyat: " + total_amount);
        System.out.println("KDV tutarı: " + tax_rate);
    }
}
