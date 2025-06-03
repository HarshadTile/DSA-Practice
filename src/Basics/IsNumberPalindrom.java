package Basics;

import java.util.Scanner;

public class IsNumberPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store original number
        int original = number;
        int reversed = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;              // Get last digit
            reversed = reversed * 10 + digit;     // Append digit
            number = number / 10;                 // Remove last digit
        }

        // Check palindrome
        if (original == reversed) {
            System.out.println("✅ Palindrome number");
        } else {
            System.out.println("❌ Not a palindrome number");
        }

        scanner.close();
    }
}
