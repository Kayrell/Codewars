package kataExercises;

// https://www.codewars.com/kata/duplicate-encoder/train/java

public class DuplicateEncoder {

    public static void main(String[] args) {
        System.out.println(encode("Success"));
    }

    static String encode(String word){
        char[] ch = word.toLowerCase().toCharArray();
        char[] ch2 = new char[word.length()];
        for (int i = 0; i < ch.length; i++) {
            ch2[i] = '(';
            for (int j = 0; j < ch.length; j++) {
                if (((ch[i] ==  ch[j]) && (i != j))){
                    ch2[i] = ')';
                }
            }
        }
        String str = String.valueOf(ch2);
        return str;

    }
}
