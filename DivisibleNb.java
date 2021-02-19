package kataExercises;

public class DivisibleNb {
    public static void main(String[] args) {
        System.out.println(isDivisible(3, 3, 4));
    }
    public static boolean isDivisible(long n, long x, long y) {
        return ((n % x == 0) && (n % y == 0)) ? true : false;
    }
}
