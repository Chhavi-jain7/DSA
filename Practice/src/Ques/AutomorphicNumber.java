package Ques;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        long square = (long) n * n;
        int temp = n;
        long d = 1;
        if (temp == 0) {
            d = 10;
        } else {
            while (temp != 0) {
                d *= 10;
                temp /= 10;
            }
        }

        if (square % d == n) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }
}
