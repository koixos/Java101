package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class DaireDilimindeAlanHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double  pi = 3.14, radius, angle, area;
        System.out.print("\nDaire Dilimi için Alan Hesaplama Programına Hoşgeldiniz\n\n");
        System.out.print("Hesaplanacak dairenin yarıçapını ve merkez açısının ölçüsünü cm ve derece cinsinden giriniz.\n\n");
        System.out.print("r: ");
        radius  = inp.nextDouble();
        System.out.print("\uD835\uDEFC: ");
        angle   = inp.nextDouble();

        area    = (pi * radius * radius * angle) / 360.0;
        System.out.print("\nAlan: " + area + "\n");
    }
}
