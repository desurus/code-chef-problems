package info.desurus;

import java.util.Scanner;

/**
 * Created by okryshch on 1/18/16.
 */
public class FindNthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();
            // lets calculate nth prime number
            if (n < 2) {
                System.out.println("2");
                System.exit(0);
            }
            if (n == 2) {
                System.out.println("3");
                System.exit(0);
            }
            int limit, root, count = 1;
            limit = (int)(n*(Math.log(n) + Math.log(Math.log(n)))) + 3;
            root = (int)Math.sqrt(limit) + 1;
            limit = (limit-1)/2;
            root = root/2 - 1;
            boolean[] sieve = new boolean[limit];
            for(int i = 0; i < root; ++i) {
                if (!sieve[i]) {
                    ++count;
                    for(int j = 2*i*(i+3)+3, p = 2*i+3; j < limit; j += p) {
                        sieve[j] = true;
                    }
                }
            }
            int p;
            for(p = root; count < n; ++p) {
                if (!sieve[p]) {
                    ++count;
                }
            }
            System.out.println(2*p+1);
            System.exit(0);
        }
    }
}
