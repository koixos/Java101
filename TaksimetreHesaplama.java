package TemelKavramlarveDegiskenler;
import java.util.Scanner;

class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int     distance;
        double  perKM = 2.20, amount = 10.0;
        System.out.print("\nTaksimetre Hesaplama Programına Hoşgeldiniz\n\n");
        System.out.print("Lütfen hesaplamak istediğiniz mesafeyi km cinsinden giriniz.\n\n");
        System.out.print("Hesaplanacak mesafe: ");
        distance    = inp.nextInt();

        amount += distance * perKM;

        amount = amount <= 20 ? 20.0 : amount;
        System.out.print("Ödenecek tutar: " + amount + "\n");
    }
}
