package kataExercises;

import java.util.Arrays;

public class Kata5 {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{3.24, 1.1, 3.240, 3.24}));
    }

    public static double findUniq(double arr[]) {
        Arrays.parallelSort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
