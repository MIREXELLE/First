package Activities;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:  ");
        String input = scan.nextLine();
        System.out.println("You entered:  " + input);
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else 
            System.out.println("The string is not a palindrome.");
    }
}
