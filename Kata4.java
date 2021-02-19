package kataExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//https://www.codewars.com/kata/alphabetical-addition/train/java

public class Kata4 {
    public static void main(String[] args) {
        System.out.println(addLetters("k"));
    }


    public static String addLetters(String ... letters) {

        Map<String, Integer> althabet = new HashMap<>();
        althabet.put("a", 1);
        althabet.put("b", 2);
        althabet.put("c", 3);
        althabet.put("d", 4);
        althabet.put("e", 5);
        althabet.put("f", 6);
        althabet.put("g", 7);
        althabet.put("h", 8);
        althabet.put("i", 9);
        althabet.put("j", 10);
        althabet.put("k", 11);
        althabet.put("l", 12);
        althabet.put("m", 13);
        althabet.put("n", 14);
        althabet.put("o", 15);
        althabet.put("p", 16);
        althabet.put("q", 17);
        althabet.put("r", 18);
        althabet.put("s", 19);
        althabet.put("t", 20);
        althabet.put("u", 21);
        althabet.put("v", 22);
        althabet.put("w", 23);
        althabet.put("x", 24);
        althabet.put("y", 25);
        althabet.put("z", 0);

        int sumOfLetters = 0;

        if (letters == null)  {
            return "o";
        }

        if(letters.length== 0){
            return "z";
        }

        for (int i = 0; i < letters.length; i++) {
                sumOfLetters += althabet.get(letters[i]);
        }

        if(sumOfLetters > 25){
            sumOfLetters = sumOfLetters - 26;
        }

        final int sumOfLetters2 = sumOfLetters;
        Optional<String> optResutlt = althabet
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(sumOfLetters2))
                .map(entry -> entry.getKey())
                .findFirst();
        if (optResutlt.isPresent()) {
            return optResutlt.get();
        }

        return "k";

    }
}
