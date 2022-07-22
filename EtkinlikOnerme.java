package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int temperature;
        System.out.print("\nEtkinlik Önerme Programı\n\n");
        System.out.print("Sıcaklık: ");
        temperature = inp.nextInt();

        System.out.print("\nÖnerilen etkinlik: ");
        if (temperature < 5 || temperature > 25) {
            if (temperature < 5)
                System.out.print("KAYAK\n");
            else
                System.out.print("YÜZME\n");
        }
        else {
            if (temperature <= 15)
                System.out.print("SINEMA\n");
            else
                System.out.print("PIKNIK\n");
        }
    }
}
