package Siniflar.BoksMaci;

public class BoksMaci {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 85, 43, 200, 20),
                f2 = new Fighter("Jacob Paul", 89, 38, 250, 15);

        Matching match = new Matching(f1, f2, 98, 75);
        match.run();
    }
}
