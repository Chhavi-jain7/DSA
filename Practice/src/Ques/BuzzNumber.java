package Ques;
import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("Buzz");
        } else {
            System.out.println("Not Buzz");
        }
    }
}
