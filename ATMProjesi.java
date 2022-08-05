package Donguler;
import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String  saved_id = "koios",
                saved_passwd = "123456789";
        int     balance = 1500;

        String  user_id, user_passwd;
        int     remainedTry = 3, exit = 0, newBalance;
        char    choice;
        System.out.print("\n\t\t\tGenç ATM Giriş Ekranı\n\n");
        do {
            System.out.print("Kullanıcı adınız: "); user_id = inp.nextLine();
            System.out.print("Şifreniz: ");         user_passwd = inp.nextLine();
            --remainedTry;
            if (saved_id.equals(user_id) && saved_passwd.equals(user_passwd))
                break;
            System.out.print("\nGiriş bilgileriyle eşleşen müşteri bulunamadı.\n");
            if (remainedTry != 0)
                System.out.print("Kalan deneme: " + remainedTry + "\n\n");
            else
                System.out.print("Hesabınız bloke edilmiştir. Lütfen bankayla iletişime geçiniz.\n\n");
        } while (remainedTry > 0);

        if (remainedTry != 0) {
            do {
                System.out.print("\n----------------------------------------------------------------------------\n\t\t\t\t\t\t\t\tMENU\n----------------------------------------------------------------------------\n\t1. Para Yatırma\n\t2. Para Çekme\n\t3. Bakiye Sorgulama\n\t0. Çıkış\n\nSeçenek: ");
                choice = inp.next().charAt(0);
                if ((int)choice < 48 || (int)choice > 51)
                    System.out.print("\nLütfen geçerli bir işlem seçiniz.\n");
                else {
                    switch (choice) {
                        case '1' -> {
                            System.out.print("\nYatırmak istediğiniz miktar: ");
                            balance += inp.nextInt();
                        }
                        case '2' -> {
                            System.out.print("\nÇekmek istediğiniz miktar: ");
                            int temp = inp.nextInt();
                            if (balance < temp)
                                System.out.print("\nIşlem başarısız: Yetersiz Bakiye\n");
                            else balance -= temp;
                        }
                        case '3' -> System.out.print("\nBakiyeniz: " + balance + " TL\n");
                        case '0' -> {
                            System.out.print("\nÇıkış yapılıyor...\n\n");
                            exit = 1;
                        }
                    }
                }
            } while (exit != 1);
        }
    }
}
