package kataExercises;
//https://www.codewars.com/kata/5a03b3f6a1c9040084001765/train/java
public class AngleSum {
    public static void main(String[] args) {
        System.out.println(sumOfAngles(5));
    }
    public static int sumOfAngles(int n) {
//        int result = 0;
        int result = (n - 2) * 180;
        return result;
    }
}
