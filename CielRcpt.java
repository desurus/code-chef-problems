package info.desurus;

import java.lang.Integer;
import java.lang.String;
import java.util.*;

/**
 * Problem https://www.codechef.com/problems/CIELRCPT
 */
class CielRcpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] priceList = {1,2,4,8,16,32,64,128,256,512,1024,2048};
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            List<Integer> result = new ArrayList<Integer>();
            // looping over given number of tests
            while (n > 0) {
                int i;
                if (sc.hasNextInt()) {
                    int inputNumber = sc.nextInt();
                    int originalInput = inputNumber;
                    int count = 0;
                    while (inputNumber > 0) {
                        if (inputNumber > priceList[11]) {
                            inputNumber = inputNumber - priceList[11];
                            count++;
                        } else {
                            for (i = 0; i < 12; i++ ) {
                                if (priceList[i] > originalInput) {
                                    break;
                                }
                            }
                            System.out.println(i);
                            inputNumber = inputNumber - priceList[i - 1];
                            System.out.println("Input number: " + inputNumber);
                            count++;
                        }
                    }
                    result.add(count);
                    n--;
                }
            }
            for (Integer line : result) {
                System.out.println(line);
            }
        }
    }
}