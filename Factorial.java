package info.desurus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem https://www.codechef.com/problems/FCTRL
 */
class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            List<Integer> result = new ArrayList<Integer>();
            do {
                if (sc.hasNextInt()){
                    int factNumber = sc.nextInt();
                    int fives = 0;
                    int m = 5;
                    do {
                        fives = fives + (factNumber/m);
                        m = m*5;
                    } while (m <= factNumber);
                    result.add(fives);
                    n--;
                } else {
                    sc.next();
                }
            } while (n > 0);
            for (Integer zeroes : result){
                System.out.println(zeroes);
            }
        }
    }
}
