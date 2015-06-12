import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	/**
	 * Returns the index at which the character needs to be removed to make the
	 * string a palindrome
	 * 
	 * @param input
	 * @return index value
	 */
	public static int getIndex(String input) {
		// If the input string is already a palindrome, return -1;
		if (isPalindrome(input)) {
			return -1;
		}
		for (int i = 0; i < input.length(); i++) {
			String left = input.substring(0, i);
			String right = input.substring(i + 1);
			// return the current index if the remaining is a palindrome
			if (isPalindrome(left + right)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Returns true if the input string is a palindrome. False, if not.
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numLines = Integer.parseInt(br.readLine());

		for (int i = 0; i < numLines; i++) {
			String input = br.readLine();
			System.out.println(getIndex(input));
		}
		// System.out.println(getIndex(input));
	}
}
