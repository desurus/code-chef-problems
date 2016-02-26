package info.desurus;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem https://www.codechef.com/problems/LUCKFOUR
 */
public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();
            while (n > 0) {
                String[] lineList = sc.nextLine().split("");
                Arrays.sort(lineList);
                int counter = 0;
                for (int i = 1; i < lineList.length; i++) {
                    if (Integer.parseInt(lineList[i]) > 4) {
                        break;
                    }
                    if (Integer.parseInt(lineList[i]) < 4) {
                        continue;
                    }
                    if (Integer.parseInt(lineList[i]) == 4) {
                        counter++;
                    }
                }
                System.out.println(counter);
                n--;
            }
        }

    }
}
