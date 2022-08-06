package Siniflar.BoksMaci;

public class Matching {
    Fighter f1;
    Fighter f2;
    int     maxWeight;
    int     minWeight;
    int     round = 0;

    Matching(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    } /* END OF Matching */

    /*  If the fighter is out of weight range, return cannot fight   */
    boolean canFight(Fighter f) {
        return f.weight >= this.minWeight && f.weight <= this.maxWeight;
    } /* END OF canFight */

    /*  This function decides which fighter will go first.
    *   If the created random number is in between 0 and 50, first fighter (f1) will make the first move.
    *   If it is in between 50 and 100, second fighter (f2) will make the first move.                        */
    void firstMove() {
        Fighter temp;
        double  randomNumber = Math.random() * 100;
        if (randomNumber >= 50.0 && randomNumber <= 100.0) {
            temp = this.f1;
            this.f1 = this.f2;
            this.f2 = temp;
        }
    } /* END OF firstMove */

    public void run() {
        boolean canF1Fight = canFight(this.f1),
                canF2Fight = canFight(this.f2);

        if (canF1Fight && canF2Fight) {
            firstMove();
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.print("\n==========================================\n" + ++round + ". ROUND\n==========================================");
                this.f2.health = this.f1.hit(this.f2);
                if (this.f2.health > 0) {
                    System.out.print("\n-----------------------------------------");
                    this.f1.health = this.f2.hit(this.f1);
                }
            }
            if (this.f1.health > this.f2.health)
                System.out.print("\n==========================================\n" + this.f1.name + " KAZANDI!\n==========================================\n");
            else System.out.print("\n==========================================\n" + this.f2.name + " KAZANDI!\n==========================================\n");
        }
        else System.out.print("\nSporcuların sikletleri uygun değil.\n");
    } /* END OF run */
}
