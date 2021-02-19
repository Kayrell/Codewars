package kataExercises;
//  https://www.codewars.com/kata/585a1a227cb58d8d740001c3/train/java
public class Repeater {
    public static void main(String[] args) {
        System.out.println(repeat("a", 5));
    }
    public static String repeat(String string,long n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(string);
    }
        return result.toString();
    }
}
