package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class KullaniciGirisEkrani {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String  saved_id     = "user01",
                saved_passwd = "123456789";

        String  user_id, user_passwd, new_passwd, selection;
        System.out.print("\nKullanıcı Giriş Ekranı\n\n");
        System.out.print("Kullanıcı adı: ");    user_id = inp.nextLine();
        System.out.print("Şifre: ");    user_passwd = inp.nextLine();

        if (user_id.equals(saved_id) && user_passwd.equals(saved_passwd))
            System.out.print("\nBaşarıyla giriş yapıldı.\n");
        else if (!user_id.equals(saved_id))
            System.out.print("\nKullanıcı adınız hatalı. Tekrar deneyiniz.\n");
        else
        {   System.out.print("\nŞifreniz hatalı.\nŞifrenizi sıfırlamak ister misiniz? [(e)vet/(h)ayir]: ");
            selection   = inp.nextLine();
            switch (selection) {
                case "e", "E", "evet", "Evet" -> {
                    System.out.print("\nYeni şifre: ");
                    new_passwd = inp.nextLine();
                    if (new_passwd.equals(saved_passwd))
                        System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz. Lütfen tekrar deneyiniz.\n");
                    else
                        System.out.print("Yeni şifreniz başarıyla oluşturuldu.\n");
                }
                case "h", "H", "hayir", "Hayir" -> System.out.print("\nÇıkış yapılıyor...\n");
                default -> System.out.print("Lütfen geçerli bir seçenek seçiniz.\n");
            }
        }
    }
}
