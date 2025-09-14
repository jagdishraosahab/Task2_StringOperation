package Task_2_String_Manipulation;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take a string input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        //Reverse the string using StringBuilder
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        //Count vowels and consonants
        int vowels = 0, consonants = 0;
        String strLower = input.toLowerCase();

        for (int i = 0; i < strLower.length(); i++) {
            char ch = strLower.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        //Check if the string is a palindrome
        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        // 5. Print all results
        System.out.println("\n--- Results ---");
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        if (isPalindrome) {
            System.out.println("The string IS a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
