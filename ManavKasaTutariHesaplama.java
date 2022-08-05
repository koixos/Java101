package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class ManavKasaTutariHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double  pear, apple, tomato, banana, aubergine, total_amount;
        double  pear_kg = 2.14,
                apple_kg = 3.67,
                tomato_kg = 1.11,
                banana_kg = 0.95,
                aubergine_kg = 5.0;

        System.out.print("\nManav Kasa Tutarı Hesaplama Programına Hoşgeldiniz\n\n");
        System.out.print("Lütfen meyve ve sebzelerin miktarlarını kg cinsinden giriniz.\n\n");
        System.out.print("Armut: ");    pear    = inp.nextDouble();
        System.out.print("Elma: ");     apple   = inp.nextDouble();
        System.out.print("Domates: ");  tomato  = inp.nextDouble();
        System.out.print("Muz: ");      banana  = inp.nextDouble();
        System.out.print("Patlıcan: "); aubergine = inp.nextDouble();

        total_amount = pear*pear_kg + apple*apple_kg + tomato*tomato_kg + banana*banana_kg + aubergine*aubergine_kg;
        System.out.print("Toplam kasa tutarı: " + total_amount + " TL\n");
    }
}
