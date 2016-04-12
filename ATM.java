package info.desurus;

import java.util.Scanner;

/**
 * Problem https://www.codechef.com/problems/HS08TEST
 * This is just a temp comment
 */
class ATM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);        
        if (!sc.hasNextInt()){
            System.exit(0); 
        } else {
            if (!sc.hasNextFloat()){
                System.exit(0);
            }
            int i = sc.nextInt();
            float f = sc.nextFloat();
            if ((0 < i && i < 2000) && (0 <= f && f <= 2000.00)){
                if (i % 5 != 0){
                    System.out.printf("%.2f\n", f);
                    System.exit(0);
                }
                if ((f - (float)i - 0.50) >= 0){
                    System.out.printf("%.2f\n", (f - (float)i - 0.50));
                } else {
                    System.out.printf("%.2f\n", f);
                }
            }
        }
    }
}
