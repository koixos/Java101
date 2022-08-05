package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double  num1, num2, num3, temp;
        System.out.print("\nSayı Sıralama\n\n");
        System.out.print("Sıralamak istediğiniz sayıları giriniz.\n\n");
        System.out.print("a: ");    num1 = inp.nextDouble();
        System.out.print("b: ");    num2 = inp.nextDouble();
        System.out.print("c: ");    num3 = inp.nextDouble();

        if (num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if (num2 > num3) {
            temp = num3;
            num3 = num2;
            num2 = temp;
        }
        if (num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        System.out.print("\nSıralama: " + num1 + " < " + num2 + " < " + num3 + "\n");
    }
}
