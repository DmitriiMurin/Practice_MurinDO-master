import java.util.ArrayList;

public class stringCalculator {
    public static void main(String[] args) {

    }

    static boolean isDigit(char check) {
        if (Character.isDigit(check)) {
            return true;
        }
        return false;
    }
    public static int calC(String input) {

        int len = input.length();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        for (int i = 0; i < len; i++) {
            if ((i + 1 <= len - 1)) {
                if (isDigit(input.charAt(i)) && isDigit(input.charAt(i + 1))) {
                    String temp = input.charAt(i) + "" + input.charAt(i + 1);
                    int toInt = Integer.parseInt(temp);
                    list1.add(toInt);
                    i = i+1;
                } else if (isDigit(input.charAt(i))) {
                    list1.add(input.charAt(i)- '0');
                } else {
                    list2.add(input.charAt(i));
                }

            }
        }

        int result = 0;
        result = result + (int) list1.get(0);
        for (int t = 0; t < list2.size(); t++) {
            char oper = (char) list2.get(t);
            if (oper == '+') {
                result = result + (int) list1.get(t + 1);

            } else if (oper == '-') {
                result = result - (int) list1.get(t + 1);
            }
        }
        return result;
    }
    }
