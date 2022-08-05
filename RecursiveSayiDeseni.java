package Metotlar;
import java.util.Scanner;

public class RecursiveSayiDeseni {
    static void recursiveSayiDeseni(int number, int temp, int flag) {
        System.out.print(temp + "  ");
        if (temp <= 0)   flag = 1;
        if (flag == 0)  temp -= 5;
        else temp += 5;
        if (temp > number) return;
        recursiveSayiDeseni(number, temp, flag);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\nSayı Deseni Oluşturma\n\nSayı: ");
        int number = inp.nextInt();
        System.out.print("\nÇıktı: ");
        recursiveSayiDeseni(number, number, 0);
        System.out.print("\n");
    }
}
