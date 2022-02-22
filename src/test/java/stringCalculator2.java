import java.util.ArrayList;
import java.util.List;

public class stringCalculator2 {
    public static void main(String[] args) {
        String string1 = "1+ 4-6 +8-9 + 23";
        System.out.println(string1);
        string1 = string1.replace(" ", "");
        System.out.println(string1);
        List<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < string1.length(); i++) {
            if (Character.isDigit(string1.charAt(i))) {
//                stringArrayList.add();
            }
        }
        System.out.println(stringArrayList);


//        char[] ch = string1.toCharArray();
//        System.out.println(ch);
//        List<Integer> digits = new ArrayList<>();
//        List<Character> characters = new ArrayList<>();
//        for (int i = 0; i < ch.length; i++) {
//            if (Character.isDigit(ch[i])) {
//                digits.add(ch[i]);
//            } else
//                characters.add(ch[i]);
//        }
//        System.out.println(digits);
//        System.out.println(characters);


    }

}

