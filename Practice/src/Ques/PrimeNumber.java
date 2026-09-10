package Ques;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean p = num >= 2;

        for (int i = 2; i <= num / i && p; i++) {
            if (num % i == 0) {
                p = false;
            }
        }

        if (p) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
