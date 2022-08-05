package Siniflar.OgrenciBilgiSistemi;
import java.util.Scanner;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teachers turk_teach = new Teachers("aa AA", "5554443322", "TURK"),
                math_teach = new Teachers("bb BB", "5554443322", "MATH"),
                phys_teach = new Teachers("cc CC", "5554443322", "PHYS"),
                chem_teach = new Teachers("dd DD", "5554443322", "CHEM"),
                bio_teach = new Teachers("ee EE", "5554443322", "BIO"),
                hist_teach = new Teachers("ff FF", "5554443322", "HIST"),
                music_teach = new Teachers("gg GG", "5554443322", "MUSIC");

        Courses turk = new Courses("Türkçe", "101", "TURK"),
                math = new Courses("Matematik", "101", "MATH"),
                phys = new Courses("Fizik", "101", "PHYS"),
                chem = new Courses("Kimya", "101", "CHEM"),
                bio = new Courses("Biyoloji", "101", "BIO"),
                hist = new Courses("Tarih", "101", "HIST"),
                music = new Courses("Müzik", "101", "MUSIC");

        Students s1 = new Students("Zeynep Gurbuz", "0001", 2, turk, math, phys, chem, bio, hist, music);

        turk.addTeacher(turk_teach);
        math.addTeacher(math_teach);
        phys.addTeacher(phys_teach);
        chem.addTeacher(chem_teach);
        bio.addTeacher(bio_teach);
        hist.addTeacher(hist_teach);
        music.addTeacher(music_teach);

        System.out.print("\n");
        turk.printTeacher();
        math.printTeacher();
        phys.printTeacher();
        chem.printTeacher();
        bio.printTeacher();
        hist.printTeacher();
        music.printTeacher();

        s1.addBulkExamNote(78,42,58,69,98,100,98);
        s1.addBulkQuizNote(65,95,46,58,93,56,100);
        s1.printStuInfo();
    }
}
