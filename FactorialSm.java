import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

/**
 * Problem https://www.codechef.com/problems/FCTRL2
 */
class FactorialSm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            List<BigInteger> resultArray = new ArrayList<BigInteger>();
            do {
                if (sc.hasNextInt()){
                    int factNumber = sc.nextInt();
                    BigInteger result = BigInteger.ONE;

       				if (factNumber == 0 || factNumber == 1){
         				resultArray.add(result);
        			} else {
       					for (int i = 1; i <= factNumber; i++) {
            				result = result.multiply(BigInteger.valueOf(i));
        				}
        				resultArray.add(result);
        			}
                    n--;
                } else {
                    sc.next();
                }
            } while (n > 0);
            for (BigInteger factorials : resultArray){
                System.out.println(factorials);
            }
        }
    }
}