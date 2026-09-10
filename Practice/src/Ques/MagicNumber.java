package Ques;
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num >= 10) {
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        if (num == 1) {
            System.out.println("Magic");
        } else {
            System.out.println("Not Magic");
        }
    }
}
