package kataExercises;
//https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
public class Diamond {

    public static void main(String[] args) {
        System.out.println(print(5));
    }

    public static String print(int n){
        String star = "*";
        StringBuilder result = new StringBuilder();
        int z = 1;
        for(int i = 0; i < n; i = i++){
            result.append("  *\n");
        }
        return result.toString();
    }
}
