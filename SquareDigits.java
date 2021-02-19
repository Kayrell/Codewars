package kataExercises;

public class SquareDigits {
    public static void main(String[] args) {
        System.out.println(squareDigits(123));
    }
    public static int squareDigits(int n) {
        String  result = "";
        int m = 0;
        do {
            m = n % 10;
            result = m*m + result;
            n = n/10;
        }while (n>0);
            int intResult = Integer.parseInt(result);
        return intResult ;
    }
}