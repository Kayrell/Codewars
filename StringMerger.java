package kataExercises;

public class StringMerger {

    public static void main(String[] args) {
        System.out.println(isMerge("Can we merge it? Yes, we can!", "a e e,w cn", "Cnwe mergit? Ys ea!"));
    }

    public static boolean isMerge(String s, String part1, String part2) {
//        "cdw", "oears" - positive
//        Empty string
//        "codewars", "code", "wars" - positive
//        "codewars", "cdwr", "oeas" -  positive
//        "codewars", "cod", "wars" - negative  ex
//        code and wasr - negative
//        'Can we merge it? Yes, we can!' is a merge of 'Cne mgei? s ca!' and 'a wer tYe,we n'
//        'LZ"Y-V0YJU;oPcBf/`u_b Dl-3caM^5]Cy`Tw)1]K\E7?LZ"Y-V0YJU;oPcBf/`u_b DlxU]7+j\CB7^Bxgs3'nWVX 8cST5GUpcpf`kjXFPt'
// is a merge of
// 'LZ"Y-V0YJU;oPcBf/`u_b DlxU]7+j\CB7^Bxgs3'nWVX'
// and 'LZ"Y-V0YJU;oPcBf/`u_b Dl-3caM^5]Cy`Tw)1]K\E7? 8cST5GUpcpf`kjXFPt'
//        'Skw<$7CA$97vcn' is a merge of '7' and 'Skw<$CA$97vcn'

//        'Can we merge it? Yes, we can!' is a merge of 'a e e,w cn' and 'Cnwe mergit? Ys ea!'

        if(s.length() != part1.length() + part2.length()) return false;
        if(s.length() == 0) return true;
        return (part1.length() > 0 && part1.charAt(0) == s.charAt(0) && isMerge(s.substring(1), part1.substring(1), part2)) ||
                (part2.length() > 0 && part2.charAt(0) == s.charAt(0) && isMerge(s.substring(1), part1, part2.substring(1)));


//        StringBuilder sReverse = new StringBuilder(s).reverse();
//        StringBuilder sPart1Reverse = new StringBuilder(part1).reverse();
//        StringBuilder sPart2Reverse = new StringBuilder(part2).reverse();
//        if (s.isEmpty()  ) {
//            return false;
//        }  else if (part1.isEmpty()) {
//            return false;
//        }
//        else if (part2.isEmpty()) {
//            return  false;
//        }
//
//        Stack<Character> stackIn = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            stackIn.push(sReverse.charAt(i));
//        }
//
//        Stack<Character> stackLeft = new Stack<>();
//        for (int i = 0; i < part1.length(); i++) {
//            stackLeft.push(sPart1Reverse.charAt(i));
//        }
//        Stack<Character> stackRight = new Stack<>();
//        for (int i = 0; i < part2.length(); i++) {
//            stackRight.push(sPart2Reverse.charAt(i));
//        }
//        boolean isLeftLast = false;
//        boolean isRightLast = false;
//
//        for (int i = 0; i <s.length() ; i++) {
//            Character letter = stackIn.pop();
////            System.out.println("This  is the Inletter " + letter);
//            if (isLeftLast) {
//                if (!stackLeft.empty() && letter.equals(stackLeft.peek())) {
//                    isLeftLast = true;
//                    Character popLeft = stackLeft.pop();
////                    System.out.println("This  is the Leftletter " + letter);
//                } else if (!stackRight.empty()  && stackRight.peek().equals(letter)){
//                    isRightLast = true;
//                    Character popRight = stackRight.pop();
////                    System.out.println("This  is the Rightletter " + letter);
//                } else {
//                    return false;
//                }
//            } else {
//                if (!stackRight.empty()  && stackRight.peek().equals(letter)) {
//                    isRightLast = true;
//                    Character popRight = stackRight.pop();
////                    System.out.println("This  is the Rightletter " + letter);
//                } else if (!stackLeft.empty() && letter.equals(stackLeft.peek())){
//                    isLeftLast = true;
//                    Character popLeft = stackLeft.pop();
////                    System.out.println("This  is the Leftletter " + letter);
//                } else {
//                    return false;
//                }
//            }
//        }
//        return  true;

    }
}

