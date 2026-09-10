package Ques;
import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int p = 1;

        if (num == 0) {
            System.out.println(0);
            return;
        }

        while (num != 0) {
            p *= num % 10;
            num /= 10;
        }

        System.out.println(p);
    }
}
