package Siniflar.MaasHesaplayici;

public class Employee {
    String  name;
    double  salary;
    int     workHours;
    int     hireYear;
    int     currentYear;

    Employee (String name, double salary, int workHours, int hireYear, int currentYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.currentYear = currentYear;
    } /* END OF Employee */

    double tax() {
        if (this.salary >= 1000)
            return this.salary * 0.03;
        return 0;
    } /* END OF tax */

    double bonus() {
        if (this.workHours > 40)
            return (workHours-40)*30;
        return 0;
    } /* END OF bonus */

    double raiseSalary() {
        int howManyYears = this.currentYear - this.hireYear;
        if (howManyYears < 10)
            return this.salary * 0.05;
        else if (howManyYears < 20)
            return this.salary * 0.1;
        else
            return this.salary * 0.15;
    } /* END OF raiseSalary */

    void printInfo() {
        double  tax = this.tax(),
                bonus = this.bonus(),
                raise = this.raiseSalary();

        System.out.print("\n======================================\nÇalışan Bilgileri\n======================================\n");
        System.out.print("Ad-Soyad\t\t: " + this.name + "\nMaaş\t\t\t: " + this.salary + "\nBaşlangıç Yılı\t: " + this.hireYear + "\nHaftalık Çalışma Saati: " + this.workHours + "\n\nVergi\t\t: " + tax + "\nBonus\t\t: " + bonus + "\nMaaş Artışı\t: " + raise + "\nToplam Maaş\t: " + (this.salary+bonus+raise-tax) + "\n");
    } /* END OF printInfo */
}
