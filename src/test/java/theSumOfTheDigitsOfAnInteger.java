import java.util.Scanner;

public class theSumOfTheDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int sum = 0;
        while (num>0){
            sum+=num%10;
            num= num/10;
        }
        System.out.println(sum);
    }
}
// Hi from Mac
