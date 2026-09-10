package Ques;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }

        int gcd = x;

        if (a == 0 || b == 0) {
            System.out.println(0);
        } else {
            long lcm = (long) a / gcd * b;
            System.out.println(lcm);
        }
    }
}
