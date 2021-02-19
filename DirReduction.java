package kataExercises;

import java.util.*;

public class DirReduction {

    public static void main(String[] args) {
//        System.out.println(dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

        Arrays.asList(dirReduc2(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})).stream().forEach(System.out::println);


    }

    public static String[] dirReduc(String[] arr) {
        ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList(arr));
        while (hasDirectlyOpposite(arr2)) {
            removeTwoElements(arr2);
        }
        return arr2.toArray(new String[0]);
    }

    private static String[] removeTwoElements(List<String> l) {
        for (int i = 1; i < l.size(); i++) {
            if(isTwoElementsOpposite(l.get(i), l.get(i-1))){
                l.set(i, "D");
                l.set(i-1, "D");
            }
        }
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            if(it.next() == "D")
                it.remove();
        }

        return l.toArray(new String[0]);
    }
    private static boolean hasDirectlyOpposite(List<String> l) {
        boolean flag = false;
        if(l.size() > 1){
            for (int i = 1; i < l.size(); i++) {
                if(isTwoElementsOpposite(l.get(i), l.get(i-1))){
                    return true;
                }
                else {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
    private static boolean isTwoElementsOpposite(String el1,  String  el2) {
        return ((el1 == "NORTH") & (el2 == "SOUTH")) ||
                ((el1 == "WEST") & (el2 == "EAST")) ||
                ((el1 == "SOUTH") & (el2 == "NORTH")) ||
                ((el1 == "EAST") & (el2 == "WEST"));
    }





    public static String[] dirReduc2(String[] arr) {
        Stack<String> stack = new Stack<>();
        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.size() > 0 && stack.peek().equals(opposite(arr[i]))) {
                stack.pop();
            }else{
                stack.add(arr[i]);
            }
        }
        return stack.toArray(new String[]{});
    }
    private static String opposite(String str){
        switch (str){
            case "NORTH": return "SOUTH";
            case "SOUTH": return "NORTH";
            case "EAST": return "WEST";
            case "WEST": return "EAST";
        }
        return null;
    }
    }

