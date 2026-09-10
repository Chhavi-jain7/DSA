package Ques;
import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if (num.length() <= 1) {
            System.out.println(num);
            return;
        }
        char[] arr = num.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println(new String(arr));
    }
}
