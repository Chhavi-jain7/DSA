package Ques;
import java.util.Scanner;

public class PrimeDigitsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        boolean allPrime = true;

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch == '-' || (ch != '2' && ch != '3' && ch != '5' && ch != '7')) {
                allPrime = false;
                break;
            }
        }

        if (allPrime) {
            System.out.println("All Prime");
        } else {
            System.out.println("Not All Prime");
        }
    }
}
