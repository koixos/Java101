package Metotlar;
import java.util.Scanner;

public class RecursiveUsAlma {
    static double recursiveUsAlma(double a, double b) {
        if (b < 0) {
            a = 1/a;
            b *= -1;
        }
        if (b == 0)
            return 1;
        b--;
        return a * recursiveUsAlma(a,b);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double  a, b, result;
        System.out.print("\nÜs Hesaplama\n\nTaban: ");
        a = inp.nextDouble();
        System.out.print("Kuvvet: ");
        b = inp.nextDouble();
        result = recursiveUsAlma(a,b);
        System.out.print("\nSonuç: " + result + "\n");
    }
}
