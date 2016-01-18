package info.desurus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem https://www.codechef.com/problems/RECIPE
 */
public class Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            // looping over given number of tests
            while (n > 0) {
                // lets read a line with ingredients
                if (sc.hasNext()) {
                    String row = sc.nextLine();
                    // lets read ingredients into list
                    String[] parts = row.split(" ");
                    int gcd = Integer.parseInt(parts[1]);
                    for (int i = 2; i < parts.length; i++) {
                        gcd = gcd(gcd, Integer.parseInt(parts[i]));
                    }
                    // now lets loop over our initial list on integers and create a result
                    List<Integer> interimResult = new ArrayList<Integer>();
                    for (int i = 1; i < parts.length; i++) {
                        interimResult.add(Integer.parseInt(parts[i])/gcd);
                    }
                    result.add(interimResult);
                }
                n--;
            }
            for (List<Integer> line : result) {
                int i = 0;
                while (i < line.size()) {
                    System.out.print(line.get(i) + " ");
                    i++;
                }
                System.out.println();
            }
        }
    }

    /**
     * Return Greatest Common Denominator for two integers
     * @param a first integer
     * @param b second integer
     * @return integer
     */
    public static Integer gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
}
