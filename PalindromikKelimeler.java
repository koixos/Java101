package Projeler;

import java.util.*;

public class PalindromikKelimeler {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\nPalindromik Mi?\n\nKelime: ");
        String  word = inp.nextLine();

        int     size = word.length();
        boolean flag = true;
        for (int i = 0; i < size/2; i++) {
            if (word.charAt(i) != word.charAt(size-1-i)) {
                flag = false;
                break;
            }
        }
        if (flag)   System.out.print("\n\"" + word + "\" palindromik bir kelimedir.\n");
        else        System.out.print("\n\"" + word + "\" palindromik bir kelime değildir.\n");
    }
}
