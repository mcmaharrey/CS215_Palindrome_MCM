import java.util.Scanner;
import java.util.Stack;
/**
 * This application will take a user input and using the stack ADT check if the entered string is a palindrome.
 * @author Matt
 *
 */
public class Application {

	public static void main(String[] args) {
		
		/**
		 * Creates a scanner and scans the next line for the phrase to be entered
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to check for palindrome.");
		String input = scanner.nextLine();
		
		/**
		 * checks if the string stored in the input is a palindrome by using isPalindrome
		 */
		if (isPalindrome(input)) {
			System.out.println("'" + input + "'"+ ": is a palindrome!");
		} else {
			System.out.println("'" + input + "'"+ ": is not a palindrome.");
		}
		
	}//end main
	
	/**
	 * 
	 * @param input
	 * @return true if the string is a palimdrome, false if not
	 */
	private static boolean isPalindrome(String input) {
		/**
		 * Takes the string and makes all the characters lower case
		 */
		String newInput = input.replaceAll("\\s", "").toLowerCase();
		
		/**
		 * Creates the stack for the characters
		 */
		Stack<Character> stack = new Stack<Character>();
		
		/**
		 * Iterates through each character in the input string and pushes the input to an array of characters
		 */
		for (char ch : newInput.toCharArray()) {
			stack.push(ch);
		}
		
		/**
		 * Compares the characters in the array and check whether the stack is empty or if the character at the top of the stack does not match the current character
		 * @return false if the character at the top of the stack does not match the current character, else return true
		 */
		for (char ch : newInput.toCharArray()) {
			if (stack.isEmpty() || stack.pop() != ch) {
				return false;
			}
		}
		return true;
	
	}

}//end class
