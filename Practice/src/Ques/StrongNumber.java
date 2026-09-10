package Ques;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int o = n;
        int sum = 0;

        if (n == 0) {
            sum = 1;
        }

        while (n != 0) {
            int d = n % 10;
            int fact = 1;

            for (int i = 1; i <= d; i++) {
                fact *= i;
            }

            sum += fact;
            n /= 10;
        }

        if (sum == o) {
            System.out.println("Strong");
        } else {
            System.out.println("Not Strong");
        }
    }
}
