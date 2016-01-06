import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
/*
* You are asked to calculate factorials of some small positive integers.
*
* Input
*
* An integer t, 1<=t<=100, denoting the number of test cases, followed by t lines, each containing a single integer n,
* 1<=n<=100.
*
* Output
*
* For each integer n given at input, display a line with the value of n!
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