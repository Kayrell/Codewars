package kataExercises;


public class Printer {
    public static void main(String[] args) {
        Printer p =  new Printer();
        System.out.println(p.printerError("mmmmmmmmms"));

    }
    public String printerError(String s) {
        char[] ch = s.toCharArray();
//        String  error = new String();

        int count = 0;
        for (char c : ch) {
            if (c > 'm'){
                count++;
            }
        }
        return Integer.valueOf(count).toString() + "/" + Integer.valueOf(s.length()).toString();

//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] > 'm') {
//                error  = error + ch[i];
//            }
//        }
//        return Integer.valueOf(error.length()).toString() + "/" + Integer.valueOf(s.length()).toString();
    }
}
