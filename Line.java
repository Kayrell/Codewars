//package kataExercises;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Line {
//    public static void main(String[] args) {
//        System.out.println(Tickets(new int[] {25, 25, 50, 50, 100}));
//    }
//
//
//
//    public static String Tickets(int[] peopleInLine){
//        //List<Integer> vasyaWallet = new ArrayList<>();
//        Map<Integer, Integer> kassa = new HashMap();
//        int change;
//        String result = "YES";
//        for (int i = 0; i < peopleInLine.length; i++) {
//
//            if(hasChange(kassa, peopleInLine[i])) {
//                changer(kassa, peopleInLine[i]);
//            } else  {
//                return "NO";
//
//            }
//        }
//        return result;
//    }
//
//    public static boolean hasChange(Map<Integer, Integer> map, int bill) {
//        boolean hasChange = false;
//        map.put(1, bill);
//
//        int numOf25 = (int) map.stream().filter(a -> a == 25).count();
//        int numOf50 = (int) map.stream().filter(a -> a == 50).count();
//        int change = bill - 25;
//        if (change == 0){
//            hasChange = true;
//        } else  if(change == 25){
//            if (numOf25 > 0){
//                hasChange = true;
//            }
//        }else if(change == 50){
//            if (numOf50 > 0){
//                hasChange = true;
//            } else if (numOf25 >= 2){
//                hasChange = true;
//            }
//        }else if(change == 75){
//            if (numOf50 > 0 & numOf25 > 0){
//                hasChange = true;
//            } else if (numOf25 >= 3){
//                hasChange = true;
//            }
//        } else {
//            hasChange = false;
//        }
//        return hasChange;
//    }
//
//    public static List<Integer> changer(Map<Integer, Integer> map, int bill){
//        int change  = bill - 25;
//        if (change == 25) {
//            arrL.remove(arrL.indexOf(25));
//        }else if (change == 50) {
//            if(arrL.contains(50)){
//                arrL.remove(arrL.indexOf(50));
//            }else {
//                arrL.remove(arrL.indexOf(25));
//                arrL.remove(arrL.indexOf(25));
//            }
//        }else if (change == 75) {
//            if(arrL.contains(50) & arrL.contains(25)){
//                arrL.remove(arrL.indexOf(25));
//                arrL.remove(arrL.indexOf(50));
//            }else {
//                arrL.remove(arrL.indexOf(25));
//                arrL.remove(arrL.indexOf(25));
//                arrL.remove(arrL.indexOf(25));
//            }
//        }
//        return arrL;
//    }
//}
