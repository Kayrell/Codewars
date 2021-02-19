package kataExercises;

import java.util.Arrays;

//https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java
public class Kata2 {

    public static void main(String[] args) {
        System.out.println(smallEnough1(new int[] { 0, 0, 0, 0, 0, 0, 2,  }, 1));
    }

    public static boolean smallEnough(int[] a, int limit) {
        Arrays.stream(a).filter(n -> n>limit).findAny().isPresent();
        boolean result = true;
        for (int number : a) {
            if(number>limit){
                result = false;
                break;
            }
        }return ! Arrays.stream(a).filter(n -> n>limit).findAny().isPresent();
    }
    public static boolean smallEnough1(int[] a, int limit) {
        return ! Arrays.stream(a).filter(n -> n>limit).findAny().isPresent();
    }

}
