package Loops;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        int a = 0;

        while (num != 0) {
            int digit = num % 10;
            a += digit;
            num /= 10;
        }
        System.out.println("Sum of digits : " + a);
    }
}
