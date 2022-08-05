package Siniflar.OgrenciBilgiSistemi;

public class Courses {
    Teachers teacher;
    String  name;
    String  code;
    String  prefix;
    int     note;
    int     quiz;

    Courses(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz = 0;
    }

    void addTeacher(Teachers teacher) {
        if (this.prefix.equals(teacher.branch)) this.teacher = teacher;
    }

    void printTeacher() {
        if (this.teacher != null) {
            System.out.print("Öğretmenin adı: " + this.teacher.name);
            System.out.print("\nÖğretmenin telefon numarası: " + this.teacher.phoneNo);
            System.out.print("\nÖğretmenin verdiği ders: " + this.name);
        }
        else System.out.print("Öğretmen eklenememiştir.");
        System.out.print("\n--------------------------------------------------\n");
    }
}
