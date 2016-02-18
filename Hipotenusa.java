package info.desurus;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem https://www.codechef.com/problems/SNAPE
 */
class Hipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");
        df.setRoundingMode(RoundingMode.CEILING);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();
            List<String> result = new ArrayList<String>();

            // loop over number of tests
            while (n > 0) {
                if (sc.hasNext()) {
                    String row = sc.nextLine();
                    String[] parts = row.split(" ");
                    double minRs = Math.sqrt(Math.pow(Double.parseDouble(parts[1]), 2)
                                             - Math.pow(Double.parseDouble(parts[0]), 2));

                    double maxRs = Math.sqrt(Math.pow(Double.parseDouble(parts[1]), 2)
                                             + Math.pow(Double.parseDouble(parts[0]), 2));

                    // adding result to the list
                    result.add(df.format(minRs) + " " + df.format(maxRs));
                }
                n--;
            }

            // printing out the results
            for (String line : result){
                System.out.println(line);
            }
        }
    }
}
