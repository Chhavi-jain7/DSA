package Ques;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int ex = sc.nextInt();
        long r = 1;

        for (int i = 1; i <= ex; i++) {
            r *= base;
        }

        System.out.println(r);
    }
}
