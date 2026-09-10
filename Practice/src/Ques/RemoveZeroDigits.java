package Ques;
import java.util.Scanner;

public class RemoveZeroDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        String r = num.replace("0", "");

        if (r.isEmpty() || r.equals("-")) {
            System.out.println(0);
        } else {
            System.out.println(r);
        }
    }
}
