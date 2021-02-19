package kataExercises;

import java.util.Arrays;

public class Kata3 {

    public static void main(String[] args) {
        System.out.println(isNice(new Integer[]{10,10,2,2,3}));
//        1, 2, 7, 8}
//        10,10,2,2,3
    }

    public static boolean isNice(Integer[] arr){
        boolean result = false;

        if(Arrays.asList(arr).isEmpty() || arr.length == 1){
            return result;
        }

        int length = arr.length;

        for (int n : arr) {
            for (int i = 0; i < length; i++) {
                if (n == arr[i]) {
                    continue;
                } else {
                    if (n == arr[i] + 1 || n == arr[i] - 1) {
                        result = true;
                        break;
                    } else {
                        result = false;
                        if (i < length -1 ) continue;
                        return result;
                    }
                }

            }
        }
        return result;
    }
}
