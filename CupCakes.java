package info.desurus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem https://www.codechef.com/problems/MUFFINS3
 */
class CupCakes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            List<Integer> result = new ArrayList<Integer>();
            do {
                if (sc.hasNextInt()){
                    int cakes = sc.nextInt();
                    if (cakes < 2 || cakes > 100000000) {
                    	System.exit(0);
                    }
                    result.add((cakes/2) + 1);
                    n--;
                } else {
                    sc.next();
                }
            } while (n > 0);
            for (Integer cakes : result){
                System.out.println(cakes);
            }
        }
    }
}
