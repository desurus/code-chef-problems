import java.lang.Character;
import java.lang.StringBuilder;
import java.util.*;

/**
 * Problem https://www.codechef.com/problems/ONP
 */
class IndexNotation {
	/**
     * Gets equation from the input in the RPN (Reverse Polish Notation) format and prints out the result.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            List<String> result = new ArrayList<String>();
            // looping over given number of tests
            while (n >= 0) {
                Stack<String> stack = new Stack<String>();
                List<String> operators = new ArrayList<String>();
                operators.add("+");
                operators.add("-");
                operators.add("*");
                operators.add("/");
                operators.add("^");
                StringBuilder resultString = new StringBuilder();

                if (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    for (int i = 0; i < line.length(); i++) {
                        String element = String.valueOf(line.charAt(i));

                        // if current element is letter add it to resulting string
                        if (Character.isLetter(line.charAt(i))) {
                            resultString.append(element);

                            // if current element is operator we add it to the stack
                        } else if (operators.contains(element)) {
                            stack.push(element);

                            // if current element is a closing bracket we need to move elements from stack to the result string
                        } else if (element.equals(")")) {
                            if (!stack.isEmpty()) {
                                resultString.append(stack.pop());
                            }
                        }
                    }
                    result.add(resultString.toString());
                    n--;
                }
            }
            for (String line : result) {
                System.out.println(line);
            }
        }
	}
}