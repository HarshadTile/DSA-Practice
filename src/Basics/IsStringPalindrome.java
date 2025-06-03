package Basics;

import java.util.Scanner;

public class IsStringPalindrome {

    public static boolean isPalindrome(String str){

        str = str.toLowerCase();
        str = str.replaceAll("^a-z","");

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = si.nextLine();

        System.out.println(isPalindrome(str));


    }
}
