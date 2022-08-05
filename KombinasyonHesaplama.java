package Donguler;
import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double i, n, r, factorialN = 1, factorialR = 1, factorialN_R = 1, result;
        System.out.print("\nKombinasyon Hesaplama\n\n");
        System.out.print("Kümenin eleman sayısı (n): ");
        n = inp.nextInt();
        System.out.print("Grupların eleman sayısı (r): ");
        r = inp.nextInt();

        if (n < r)
            System.out.print("\nKümenin eleman sayısı oluşturulacak grupların eleman sayısından küçük olamaz.\n");
        else {
            for (i = n; i > 0; i--) factorialN *= i;
            for (i = r; i > 0; i--) factorialR *= i;
            for (i = n - r; i > 0; i--) factorialN_R *= i;

            result = factorialN / (factorialR * factorialN_R);
            System.out.print("\nKombinasyon C(" + n + "\b\b," + r + "\b\b) : " + result + "\n");
        }
    }
}
