package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int math, turk, phys, chem, hist, music;
        Scanner input = new Scanner(System.in);

        System.out.print("\nNot Ortalaması Hesaplama Programına Hoşgeldiniz!\n\n");
        System.out.print("Türkçe: ");   turk = input.nextInt();
        System.out.print("Matematik: "); math = input.nextInt();
        System.out.print("Fizik: ");    phys = input.nextInt();
        System.out.print("Kimya: ");    chem = input.nextInt();
        System.out.print("Tarih: ");    hist = input.nextInt();
        System.out.print("Müzik: ");    music = input.nextInt();

        float average = (math+turk+phys+chem+hist+music) / 6.0f;
        System.out.println("\nOrtalama: " + average);
        System.out.println(average >= 60.0 ? "Tebrikler, Sınıfı Geçtiniz :)" : "Ne Yazık ki Sınıfta Kaldınız :(");
    }
}
