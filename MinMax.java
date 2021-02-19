package kataExercises;

import java.util.Arrays;
import java.util.OptionalInt;

//https://www.codewars.com/kata/559590633066759614000063/train/java
public class MinMax {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax1(new int[]{1,2,3,4,5})));
    }
    public static int[] minMax(int[] arr) {
        int maximum = arr[0];
        int minimum = arr[0];
        int[] arr2 = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) maximum = arr[i];
            if (minimum > arr[i]) minimum = arr[i];
        }
        arr2[0] = minimum;
        arr2[1] = maximum;

        return arr2;
    }
    public static int[] minMax1(int[] arr) {
        int[] arr2 = new int[2];
        OptionalInt min = Arrays.stream(arr).min();
        OptionalInt max = Arrays.stream(arr).max();
        if (min.isPresent() && max.isPresent()) {
            arr2[0] = min.getAsInt();
            arr2[1] = max.getAsInt();
        }
        return arr2;
    }
}
