package kataExercises;

import java.util.*;
import java.util.stream.Collectors;

public class TwoToOne {

    public static void main(String[] args) {
        System.out.println(longest1("aabcd", "aeeefaabc"));
    }

    public static String longest (String s1, String s2) {
        List<Character> list = s1.concat(s2).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))){
                Character letter = list.get(i);
                list.removeAll(Arrays.asList(letter));
                list.add(i, letter);
            }
        }
        return list.stream().map(c -> c.toString()).collect(Collectors.joining());
    }
    public static String longest1 (String s1, String s2) {
        return   s1.concat(s2).chars().mapToObj(c ->  Character.valueOf((char)c).toString()).sorted().distinct().collect(Collectors.joining());
    }
}

