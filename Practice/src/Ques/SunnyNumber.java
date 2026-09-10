package Ques;
import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int next = num + 1;
        int root = (int) Math.sqrt(next);

        if (root * root == next) {
            System.out.println("Sunny");
        } else {
            System.out.println("Not Sunny");
        }
    }
}
