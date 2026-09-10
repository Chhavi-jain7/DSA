package Ques;
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int p = 1;

        if (num == 0) {
            sum = 0;
            p = 0;
        }

        while (num != 0) {
            int d = num % 10;
            sum += d;
            p *= d;
            num /= 10;
        }

        if (sum == p) {
            System.out.println("Spy");
        } else {
            System.out.println("Not Spy");
        }
    }
}
