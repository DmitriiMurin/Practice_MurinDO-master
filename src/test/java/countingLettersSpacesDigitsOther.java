import java.util.Scanner;

public class countingLettersSpacesDigitsOther {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any letters, spaces, digits and others: ");
        String str = input.nextLine();
        cloud(str);
    }

    public static void cloud(String x) {
        char[] ch = x.toCharArray();
        int letters = 0;
        int spaces = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                letters++;
            }
            else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            }
            else if (Character.isDigit(ch[i])) {
                digits++;
            } else {
                others++;
            }
        }
        System.out.println("Letters: "+letters);
        System.out.println("spaces: "+spaces);
        System.out.println("digits: "+digits);
        System.out.println("others: "+others);
    }
}
