import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static int numSquares(int a, int b) {
		int sqrtA = (int) Math.sqrt(a);
		int sqrtB = (int) Math.sqrt(b);
        int count = sqrtB - sqrtA;
		return (Math.sqrt(a) % 1 == 0) ? ++count : count;
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numTestCases = Integer.parseInt(br.readLine());
		int count = 0;

		while (count < numTestCases) {
			String currentLine = br.readLine();
			String[] arr = currentLine.split(" ");
			System.out.println(numSquares(Integer.parseInt(arr[0]),
					Integer.parseInt(arr[1])));
		}
	}
}
