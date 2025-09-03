package Activities;

import java.util.Scanner;

public class act {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:  ");
        String input = scan.nextLine();
        System.out.println("You entered:  " + input);
        System.out.println("Length: " + input.length()); // Length of the string
        System.out.println("UpperCase: " + input.toUpperCase()); // Uppercase
        System.out.println("LowerCase: " + input.toLowerCase()); // Lowercase
        System.out.println("First Letter: " + input.charAt(0)); // First letter
        System.out.println("Last Letter: " + input.charAt(input.length() - 1)); // Last letter
        System.out.println("2nd character to 5th character:" + input.substring(1, 6)); // Substring
    }
}
