package Ques;
import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        if (num.charAt(0) != '0' && num.contains("0")) {
            System.out.println("Duck");
        } else {
            System.out.println("Not Duck");
        }
    }
}
