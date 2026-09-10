package Ques;
import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Not Fibonacci");
            return;
        }

        int a = 0;
        int b = 1;
        boolean found = num == 0;

        while (b <= num) {
            if (b == num) {
                found = true;
                break;
            }

            int c = a + b;
            a = b;
            b = c;
        }

        if (found) {
            System.out.println("Fibonacci");
        } else {
            System.out.println("Not Fibonacci");
        }
    }
}
