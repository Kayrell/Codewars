package kataExercises;

import java.util.Objects;

public class Vowels {

    public static void main(String[] args) {
        System.out.println(getCount(null));
    }

    public static int getCount(String str) {
//        int vowelsCount = 0;
//
//        str.chars().mapToObj(x -> (char) x).filter(x -> Objects.equals(x, 'a') | Objects.equals(x, 'e') | Objects.equals(x, 'i') | Objects.equals(x, 'o') | Objects.equals(x, 'u')).count();
//
//        char[] ch = str.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            if(Objects.equals(ch[i], 'a') | Objects.equals(ch[i], 'e') | Objects.equals(ch[i], 'i') | Objects.equals(ch[i], 'o') | Objects.equals(ch[i], 'u')){
//                vowelsCount++;
//            }
//        }
        if(str == null){
            return 0;
        }

        return (int) str.chars().mapToObj(x -> (char) x).filter(x -> Objects.equals(x, 'a') | Objects.equals(x, 'e') | Objects.equals(x, 'i') | Objects.equals(x, 'o') | Objects.equals(x, 'u')).count();

    }
}
