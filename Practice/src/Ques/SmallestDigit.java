package Ques;
import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int s = 9;
        if (num == 0) {
            s = 0;
        }
        while (num != 0) {
            int digit = num % 10;
            if (digit < s) {
                s = digit;
            }
            num /= 10;
        }

        System.out.println(s);
    }
}
