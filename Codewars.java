package kataExercises;
//https://www.codewars.com/kata/5949481f86420f59480000e7/train/java
import java.util.Arrays;

public class Codewars {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{2, 5, 34, 6}));
    }
    public static String oddOrEven (int[] array){

        if(Arrays.stream(array).sum() % 2 == 0){return "even";}
        return "odd";






//
//        int sum = 0;
//        String result =  "odd";
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        if(sum % 2 == 0){
//            result = "even";
//        }
//        return result;
    }
}
