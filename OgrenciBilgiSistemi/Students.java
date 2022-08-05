package Siniflar.OgrenciBilgiSistemi;

public class Students {
    String  name;
    String  stuNo;
    int     grade;
    Courses math,
            phys,
            chem,
            turk,
            bio,
            hist,
            music;
    double  average;
    boolean isPassed;

    Students(String name, String stuNo, int grade, Courses turk, Courses math, Courses phys, Courses chem, Courses bio, Courses hist, Courses music) {
        this.name = name;
        this.stuNo = stuNo;
        this.turk = turk;
        this.math = math;
        this.phys = phys;
        this.chem = chem;
        this.bio = bio;
        this.hist = hist;
        this.music = music;
        this.grade = grade;
        this.average = 0.0;
        this.isPassed = false;
    }

    void addBulkExamNote(int turk, int math, int phys, int chem, int bio, int hist, int music) {
        if (turk > 0 && turk <= 100) this.turk.note = turk;
        if (math > 0 && math <= 100) this.math.note = math;
        if (phys > 0 && phys <= 100) this.phys.note = phys;
        if (chem > 0 && chem <= 100) this.chem.note = chem;
        if (bio > 0 && bio <= 100)   this.bio.note = bio;
        if (hist > 0 && hist <= 100) this.hist.note = hist;
        if (music > 0 && music <= 100) this.music.note = music;
    }

    void addBulkQuizNote(int turk, int math, int phys, int chem, int bio, int hist, int music) {
        if (turk > 0 && turk <= 100) this.turk.quiz = turk;
        if (math > 0 && math <= 100) this.math.quiz = math;
        if (phys > 0 && phys <= 100) this.phys.quiz = phys;
        if (chem > 0 && chem <= 100) this.chem.quiz = chem;
        if (bio > 0 && bio <= 100)   this.bio.quiz = bio;
        if (hist > 0 && hist <= 100) this.hist.quiz = hist;
        if (music > 0 && music <= 100) this.music.quiz = music;
    }

    /*  Turkish     : exam --> %80 , quiz --> %20
    *   Mathematics : exam --> %80 , quiz --> %20
    *   Physics     : exam --> %60 , quiz --> %40
    *   Chemistry   : exam --> %60 , quiz --> %40
    *   Biology     : exam --> %70 , quiz --> %30
    *   History     : exam --> %60 , quiz --> %40
    *   Music       : exam --> %50 , quiz --> %50  */

    void calcAverage() {
        double  turkAverage, mathAverage, physAverage, chemAverage, bioAverage, histAverage, musicAverage;
        turkAverage = this.turk.note * 0.8 + this.turk.quiz * 0.2;
        mathAverage = this.math.note * 0.8 + this.math.quiz * 0.2;
        physAverage = this.phys.note * 0.6 + this.phys.quiz * 0.4;
        chemAverage = this.chem.note * 0.6 + this.chem.quiz * 0.4;
        bioAverage  = this.bio.note * 0.7 + this.bio.quiz * 0.3;
        histAverage = this.hist.note * 0.6 + this.hist.quiz * 0.4;
        musicAverage = this.music.note * 0.5 + this.music.quiz * 0.5;

        this.average = (turkAverage + mathAverage + physAverage + chemAverage + bioAverage + histAverage + musicAverage) / 7.0;
    }

    void isPassed() {
        if (this.average >= 50.0)
            this.isPassed = true;
    }

    void printStuInfo() {
        System.out.print("\n==================================================\nÖĞRENCI BILGILERI\n==================================================\nAd-Soyad: " + this.name + "\nNumara: " + this.stuNo + "\nSınıf: " + this.grade);
        System.out.print("\n\n[Türkçe\t\t==> Sınav -> %80 - Sözlü -> %20]\n[Matematik\t==> Sınav -> %80 - Sözlü -> %20]\n[Fizik\t\t==> Sınav -> %60 - Sözlü -> %40]\n[Kimya\t\t==> Sınav -> %60 - Sözlü -> %40]\n[Biyoloji\t==> Sınav -> %70 - Sözlü -> %30]\n[Tarih\t\t==> Sınav -> %60 - Sözlü -> %40]\n[Müzik\t\t==> Sınav -> %50 - Sözlü -> %50]\n\n" + this.turk.name + "\t\t-->\tSınav notu: " + this.turk.note + "\t Sözlü notu: " + this.turk.quiz + "\n");
        System.out.print(this.math.name + "\t-->\tSınav notu: " + this.math.note + "\t Sözlü notu: " + this.math.quiz + "\n");
        System.out.print(this.phys.name + "\t\t-->\tSınav notu: " + this.phys.note + "\t Sözlü notu: " + this.phys.quiz + "\n");
        System.out.print(this.chem.name + "\t\t-->\tSınav notu: " + this.chem.note + "\t Sözlü notu: " + this.chem.quiz + "\n");
        System.out.print(this.bio.name + "\t-->\tSınav notu: " + this.bio.note + "\t Sözlü notu: " + this.bio.quiz + "\n");
        System.out.print(this.hist.name + "\t\t-->\tSınav notu: " + this.hist.note + "\t Sözlü notu: " + this.hist.quiz + "\n");
        System.out.print(this.music.name + "\t\t-->\tSınav notu: " + this.music.note + "\t Sözlü notu: " + this.music.quiz + "\n\n");

        calcAverage();
        isPassed();

        if (this.isPassed)
            System.out.print("Genel ortalama: " + this.average + "\nGeçme durumu: Geçti\n");
        else
            System.out.print("Genel ortalama: " + this.average + "\nGeçme durumu: Kaldı\n");
    }
}
