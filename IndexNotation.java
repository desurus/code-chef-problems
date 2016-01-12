import java.util.*;

/**
 * Problem https://www.codechef.com/problems/ONP
 */
class IndexNotation {
	/*
	Gets equation from the input in the Index Notation (Polish Notation)
	format and prints out the result.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		List<String> operators = new ArrayList<String>();
		operators.add("+");
		operators.add("-");
		operators.add("*");
		operators.add("/");

		if (sc.hasNextLine()) {
			String line = sc.nextLine();
			for (int i = (line.length() - 1); i >= 0; i--) {
				String element = String.valueOf(line.charAt(i));
				// his is operator and we need to pop two elements from stack
				// use operator on them and put the result back in stack
				if (operators.contains(element)) {
					int operand1 = (int)stack.pop();
					int operand2 = (int)stack.pop();
					int result = 0;
					if (element.equals("+")) {
						result = operand1 + operand2;
					}
					if (element.equals("-")) {
						result = operand1 - operand2;
					}
					if (element.equals("*")) {
						result = operand1 * operand2;
					}
					if (element.equals("/")) {
						result = operand1 / operand2;
					}
					// put the result back to stack
					stack.push(result);
				}
				if (element.matches(".*\\d.*")) {
					stack.push(Integer.parseInt(element));
				}
			}
			System.out.println(stack.pop());
		}
	}
}