package Ques;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(0);
            return;
        }
        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num /= 2;
        }

        System.out.println(binary);
    }
}
