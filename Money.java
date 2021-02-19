package kataExercises;

public class Money {

    public static void main(String[] args) {
        Money m = new Money();
        System.out.println(m.calculateYears(1 , 0.05, 0.18, 1));
    }

    public static int calculateYears(double principal, double interest,  double tax, double desired) {

        int yearscounter = 0;
        while(principal<desired){
            //годовой доход без налога
            double pi = principal  * interest;

            // налогоая сумма
            double pit = pi * tax;

            // годовой доход с налогом
            double pYear = pi - pit;

            // сумма в конце
            principal = principal + pYear;

            yearscounter++;
        }



        return yearscounter;
    }
}
