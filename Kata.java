package kataExercises;

// https://www.codewars.com/kata/58e0f0bf92d04ccf0a000010/train/java

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        System.out.println(lostSheeps(new int[]{1, 2}, new int[]{3, 4}, 15));
    }

    public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
        return sheepsTotal - Arrays.stream(fridayNightCounting)
                .sum()  - Arrays.stream(saturdayNightCounting)
                .sum();
    }
}
