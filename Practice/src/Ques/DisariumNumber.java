package Ques;
import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int d = 0;
        int temp = n;

        if (n == 0) {
            d = 1;
        } else {
            while (temp != 0) {
                d++;
                temp /= 10;
            }
        }

        long sum = 0;
        temp = n;
        int position = d;

        while (temp != 0) {
            int digit = temp % 10;
            long power = 1;

            for (int i = 1; i <= position; i++) {
                power *= digit;
            }

            sum += power;
            position--;
            temp /= 10;
        }

        if (num >= 0 && sum == num) {
            System.out.println("Disarium");
        } else {
            System.out.println("Not Disarium");
        }
    }
}
