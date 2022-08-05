package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int year;
        System.out.print("\nÇin Zodyağı Hesaplama\n\n");
        System.out.print("Doğum yılınız: ");
        year = inp.nextInt();

        switch (year % 12) {
            case 0: System.out.print("\nÇin Zodyağı Burcunuz: MAYMUN\n");
                    break;
            case 1: System.out.print("\nÇin Zodyağı Burcunuz: HOROZ\n");
                    break;
            case 2: System.out.print("\nÇin Zodyağı Burcunuz: KÖPEK\n");
                    break;
            case 3: System.out.print("\nÇin Zodyağı Burcunuz: DOMUZ\n");
                    break;
            case 4: System.out.print("\nÇin Zodyağı Burcunuz: FARE\n");
                    break;
            case 5: System.out.print("\nÇin Zodyağı Burcunuz: ÖKÜZ\n");
                    break;
            case 6: System.out.print("\nÇin Zodyağı Burcunuz: KAPLAN\n");
                    break;
            case 7: System.out.print("\nÇin Zodyağı Burcunuz: TAVŞAN\n");
                    break;
            case 8: System.out.print("\nÇin Zodyağı Burcunuz: EJDERHA\n");
                    break;
            case 9: System.out.print("\nÇin Zodyağı Burcunuz: YILAN\n");
                    break;
            case 10: System.out.print("\nÇin Zodyağı Burcunuz: AT\n");
                    break;
            case 11: System.out.print("\nÇin Zodyağı Burcunuz: KOYUN\n");
                    break;
        }
    }
}
