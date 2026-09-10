package Ques;
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long square = (long) num * num;
        long sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == num) {
            System.out.println("Neon");
        } else {
            System.out.println("Not Neon");
        }
    }
}
