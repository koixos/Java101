package Siniflar.BoksMaci;

public class Fighter {
    String  name;
    int     weight;
    int     damage;
    int     health;
    int     dodge;  // dodging chance

    Fighter(String name, int weight, int damage, int health, int dodge) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
        this.health = health;
        /*  if dodge value is invalid, make it zero */
        if (dodge >= 0 && dodge <= 100)
            this.dodge = dodge;
        else this.dodge = 0;
    } /* END OF Fighter */

    /*  This function will return if the target can block the hit   */
    boolean dodge() {
        double  randomNumber = Math.random() * 100;
        return randomNumber >= 0 && randomNumber <= this.dodge;
    } /* END OF dodge */

    int hit(Fighter foe) {
        System.out.print("\n" + this.name + " ==> " + foe.name + "'a -" + this.damage + " hasar verdi!\n");
        if(!foe.dodge()) {
            if (foe.health - this.damage < 0)
                foe.health = 0;
            else foe.health -= this.damage;
        }
        else System.out.print("\n" + foe.name + " saldırıyı blokladı!\n");
        this.remainedHealth();
        foe.remainedHealth();
        return foe.health;
    } /* END OF hit */

    void remainedHealth() {
        System.out.print("\n" + this.name + "'nin kalan canı: " + this.health);
    } /* END OF remainedHealth */
}
