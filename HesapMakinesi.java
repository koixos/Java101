package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double  num1, num2;
        int     selection;
        System.out.print("\nHesap Makinesi\n\n");
        System.out.print("Ilk sayı: ");     num1 = inp.nextDouble();
        System.out.print("Ikinci Sayı: ");  num2 = inp.nextDouble();
        System.out.print("\nYapmak istediğiniz işlemi seçiniz:\n\n\t1. Toplama\n\t2. Çıkarma\n\t3. Çarpma\n\t4. Bölme\n\nSeçim: ");
        selection   = inp.nextInt();

        switch (selection)
        {   case 1:
                System.out.print("\n" + num1 + " + " + num2 + " = " + (num1+num2) + "\n\n");
                break;
            case 2:
                System.out.print("\n" + num1 + " - " + num2 + " = " + (num1-num2) + "\n\n");
                break;
            case 3:
                System.out.print("\n" + num1 + " x " + num2 + " = " + (num1*num2) + "\n\n");
                break;
            case 4:
                System.out.print(num2 == 0 ? "\nPayda sıfır olamaz!\n" : "\n" + num1 + " / " + num2 + " = " + (num1/num2) + "\n\n");
                break;
            default:
                System.out.print("\nLütfen geçerli bir işlem giriniz.\n");
                break;
        }
    }
}
