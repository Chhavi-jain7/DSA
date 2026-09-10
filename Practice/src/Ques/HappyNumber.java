package Ques;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;

        while (n != 1 && n != 4) {
            int sum = 0;

            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println("Happy");
        } else {
            System.out.println("Not Happy");
        }
    }
}
