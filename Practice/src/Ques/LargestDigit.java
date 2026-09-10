package Ques;
import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int l = 0;

        while (num != 0) {
            int d = num % 10;

            if (d > l) {
                l = d;
            }

            num /= 10;
        }

        System.out.println(l);
    }
}
