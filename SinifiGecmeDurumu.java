package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int     math, turk, phys, chem, mus;
        double  average;
        System.out.print("\nSınıf geçme/kalma durumunuzu öğrenmek için lütfen ders notlarınızı giriniz.\nGeçme notu: 55\n\n");
        System.out.print("Türkçe: ");       turk = inp.nextInt();
        if (turk < 0 || turk > 100)
            turk = 0;
        System.out.print("Matematik: ");    math = inp.nextInt();
        if (math < 0 || math > 100)
            math = 0;
        System.out.print("Fizik: ");        phys = inp.nextInt();
        if (phys < 0 || phys > 100)
            phys = 0;
        System.out.print("Kimya: ");        chem = inp.nextInt();
        if (chem < 0 || chem > 100)
            chem = 0;
        System.out.print("Müzik: ");        mus = inp.nextInt();
        if (mus < 0 || mus > 100)
            mus = 0;

        average = (math + turk + chem + phys + mus) / 5.0;
        System.out.print("\nOrtalamanız: " + average + "\n");
        if (average >= 55.0)
            System.out.print("\nTebrikler, geçiyorsunuz!\n");
        else
            System.out.print("\nGeçmiş olsun, kalıyorsunuz!\n");
    }
}
