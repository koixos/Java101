package Metotlar;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    static Scanner inp = new Scanner(System.in);
    static String displayMenu() {
        String selection;
        System.out.print("\n-----------------------------------------------------\n\t\t\tGELISMIS HESAP MAKINESI\n-----------------------------------------------------\n\tMENU:\n\n\t1. Toplama\n\t2. Çıkarma\n\t3. Çarpma\n\t4. Bölme\n\t5. Üs Alma\n\t6. Faktöriyel Hesaplama\n\t7. Mod Alma\n\t8. Dikdörtgen için Alan ve Çevre Hesabı\n\t0. Çıkış\n\nIşlem: ");
        selection = inp.next();
        System.out.print("-----------------------------------------------------");
        return selection;
    } /* END OF displayMenu */
    static void toplama(double a, double b) {
        System.out.print("\n" + a + " + " + b + " = " + (a+b));
    } /* END OF toplama */
    static void cikarma(double a, double b) {
        System.out.print("\n" + a + " - " + b + " = " + (a-b));
    } /* END OF cikarma */
    static void carpma(double a, double b) {
        System.out.print("\n" + a + " x " + b + " = " + (a*b));
    } /* END OF carpma */
    static int bolme(double a, double b) {
        if (b == 0)
            return -999;
        System.out.print("\n" + a + " / " + b + " = " + (a/b));
        return 0;
    } /* END OF bolme */
    static void usAlma(double a, double b) {
        double  result = 1, tempA = a, tempB = b;
        if (b < 0) {
            a = 1/a;
            b *= -1;
        }
        for (int i = 0; i < b; i++)
            result *= a;
        System.out.print("\n" + tempA + " üzeri " + tempB + " = " + result);
    } /* END OF usAlma */
    static int faktoriyel(int a) {
        int  result = a;
        if (a == 0)
            result = 1;
        else if (a < 0)
            return -999;
        else {
            int temp = a;
            while (temp > 1) {
                --temp;
                result *= temp;
            }
        }
        System.out.print("\n" + a + "!" + " = " + result);
        return 0;
    } /* END OF faktoriyel */
    static int mod(double a, double b) {
        if (b == 0)
            return -999;
        System.out.print("\nmod(" + a + "," + b + ") = " + (a%b));
        return 0;
    } /* END OF mod */
    static int alanVeCevre(double a, double b) {
        if (a <= 0 || b <= 0)
            return -999;
        System.out.print("\nÇevre: " + 2*(a+b) + "\n");
        System.out.print("\nAlan: " + (a*b));
        return 0;
    } /* END OF carpma */
    public static void main(String[] args) {
        String selection;
        boolean exit = false;
        double  num1, num2;
        while (!exit) {
            int     errorCode = 0;
            selection = displayMenu();
            switch (selection) {
                case "0" -> {
                    System.out.print("\nÇıkış yapılıyor...\n");
                    exit = true;
                }
                case "1" -> {
                    System.out.print("\n(orn: x + y)\nx: ");
                    num1 = inp.nextDouble();
                    System.out.print("y: ");
                    num2 = inp.nextDouble();
                    toplama(num1, num2);
                }
                case "2" -> {
                    System.out.print("\n(orn: x - y)\nx: ");
                    num1 = inp.nextDouble();
                    System.out.print("y: ");
                    num2 = inp.nextDouble();
                    cikarma(num1, num2);
                }
                case "3" -> {
                    System.out.print("\n(orn: x * y)\nx: ");
                    num1 = inp.nextDouble();
                    System.out.print("y: ");
                    num2 = inp.nextDouble();
                    carpma(num1, num2);
                }
                case "4" -> {
                    System.out.print("\n(orn: x / y)\nx: ");
                    num1 = inp.nextDouble();
                    System.out.print("y: ");
                    num2 = inp.nextDouble();
                    errorCode = bolme(num1, num2);
                }
                case "5" -> {
                    System.out.print("\nTaban: ");
                    num1 = inp.nextDouble();
                    System.out.print("Kuvvet: ");
                    num2 = inp.nextDouble();
                    usAlma(num1, num2);
                }
                case "6" -> {
                    System.out.print("\n(orn: x!)\nx: ");
                    num1 = inp.nextInt();
                    errorCode = faktoriyel((int) num1);
                }
                case "7" -> {
                    System.out.print("\n(orn: mod(x,y))\nx: ");
                    num1 = inp.nextDouble();
                    System.out.print("y: ");
                    num2 = inp.nextDouble();
                    errorCode = mod(num1, num2);
                }
                case "8" -> {
                    System.out.print("\nUzunluk: ");
                    num1 = inp.nextDouble();
                    System.out.print("Genişlik: ");
                    num2 = inp.nextDouble();
                    errorCode = alanVeCevre(num1, num2);
                }
                default -> System.out.print("\nGeçersiz işlem");
            }
            if (errorCode != 0)
                System.out.print("\nHatalı işlem");
        }
    }
}
