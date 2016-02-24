package info.desurus;

import java.util.Scanner;

/**
 * Problem https://www.codechef.com/problems/FLOW006
 */
public class AdditionN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();
            while (n > 0) {
                Scanner scl = new Scanner(sc.nextLine()).useDelimiter("");
                int result = 0;
                while (scl.hasNext()) {
                    result += Integer.parseInt(scl.next());
                }
                System.out.println(result);
                n--;
            }
        }

    }
}
