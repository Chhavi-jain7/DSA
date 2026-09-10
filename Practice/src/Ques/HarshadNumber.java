package Ques;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (n != 0 && n % sum == 0) {
            System.out.println("Harshad");
        } else {
            System.out.println("Not Harshad");
        }
    }
}
