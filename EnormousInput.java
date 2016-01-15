package info.desurus;

import java.util.Scanner;

/**
 * Problem https://www.codechef.com/problems/INTEST
 */
class EnormousInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()){
            System.exit(0);    
        } else {
            int n = sc.nextInt();
            if (!sc.hasNextInt()){
                System.exit(0);
            }
            int k = sc.nextInt();
            if (n > 0){
                int counter = 0;
                do {
                    if (sc.nextInt() % k == 0){
                        counter++;    
                    } 
                    n--;
                } while (n > 0);
                System.out.println(counter);
            }
        }
    }
}
