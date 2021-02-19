package kataExercises;
// https://www.codewars.com/kata/are-they-the-same/train/java
// ToDo - не прошли несколько тестов, доделать

import static java.lang.System.*;

public class AreSame {

    public static void main(String[] args) {
//        int[] a = new int[]{1, 5};
//        int[] b = new int[]{1, 25, 121};
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};
/*
        int[] a = new int[]{};
        int[] b = new int[]{11};
*/
        out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        if(a.length == 0 | b.length  == 0){
            return false;
        }
        int[] secondA = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            secondA[i] = a[i] * a[i];
        }

        boolean isSame = true;
        for (int number : b) {
            for (int i = 0; i < b.length; i++) {
                if (number != secondA[i]) {
                    isSame = false;
                    if (i == secondA.length - 1) {
                        return isSame;
                    }
                } else {
                    isSame = true;
                    break;
                }
            }
        }

        return isSame;
    }
}






//() -> Arrays.stream(b)
//            .forEach(Math.sqrt(i));
//}
