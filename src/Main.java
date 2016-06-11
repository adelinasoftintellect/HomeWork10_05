import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the expression: ");
		String s = input.nextLine();
		System.out.println(balancedParenthensies(s));
		input.close();
	}

	public static boolean balancedParenthensies(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				stack.push(c);
			} else if (c == ']') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '[')
					return false;

			} else if (c == ')') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '(')
					return false;

			} else if (c == '}') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '{')
					return false;
			}
		}
		return stack.isEmpty();
	}
}
