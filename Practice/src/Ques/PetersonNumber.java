package Ques;
import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int original = n;
        int sum = 0;

        if (n == 0) {
            sum = 1;
        }

        while (n != 0) {
            int digit = n % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            n /= 10;
        }

        if (sum == original) {
            System.out.println("Peterson");
        } else {
            System.out.println("Not Peterson");
        }
    }
}
