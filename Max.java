package kataExercises;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static java.util.Arrays.copyOfRange;

public class  Max {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, -1, -3, 4, -1, -2, -1, -5, -4}));
        System.out.println(sequence1(new int[]{-2, -1, -3, 4, -1, -2, -1, -5, -4}));
    }
    public static int sequence(int[] arr) {
        int length = arr.length;
        int  max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int[] subarr = copyOfRange(arr, i, i + j);
                if(sumArray(subarr)>max){
                    max = sumArray(subarr);
                }
            }
        }
        return max;
    }
    private static int sumArray(int[] subarr){
        if(asList(subarr).isEmpty()) return 0;

        if(Arrays.stream(subarr).filter(h -> h > 0).count() == 0) return 0;

        return Arrays.stream(subarr).sum();
    }
    public static int sequence1(int[] arr) {
        int inst = 0, max = 0;
        for (int i : arr) {
            inst = Math.max(0, inst + i);
            max = Math.max(max, inst);
        }
        return max;
    }
}
