package kataExercises;

public class Kata1 {
    public static void main(String[] args) {
        System.out.println(alternateCase1("ААПРапрАПРапр"));
    }
    static String alternateCase(final String string) {
        char[] ch = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            String st = String.valueOf(ch[i]);
            if(String.valueOf(ch[i]).equals(st.toUpperCase())){
                stringBuilder = stringBuilder.append(st.toLowerCase());
            } else{
                stringBuilder = stringBuilder.append(st.toUpperCase());
            }
        }
        return stringBuilder.toString();
    }
    static String alternateCase1(final String string) {
        StringBuilder builder = new StringBuilder();
        string.chars()
                .peek(e -> System.out.println("First peek: " + e))
                .map(Kata1::toAnotherCase)
                .peek(e -> System.out.println("Second peek: " + e))
                .forEach(ch -> builder.append(ch));
        return builder.toString();
    }
    static Character  toAnotherCase(Integer charInt) {
//        Character.valueOf(charInt)
        Character c = Character.forDigit(charInt, 10);
        if(Character.isLowerCase(c)){
            c = Character.toUpperCase(c);
        }else {
            c = Character.toLowerCase(c);
        }
        return c;
    }
}
