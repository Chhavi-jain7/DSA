package Ques;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        int d = 0;
        int p = 1;
        for (int i = b.length() - 1; i >= 0; i--) {
            int digit = b.charAt(i) - '0';
            d += digit * p;
            p *= 2;
        }
        System.out.println(d);
    }
}
