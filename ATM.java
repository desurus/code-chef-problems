import java.util.Scanner;
/*
* Pooja would like to withdraw X $USD from an ATM. The cash machine will only accept the transaction if X is a
* multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction
* (including bank charges). For each successful withdrawal the bank charges 0.50 $USD.
* Calculate Pooja's account balance after an attempted transaction.
*
* Input
*
* Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
* Non negative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
*
* Output
*
* Output the account balance after the attempted transaction, given as a number with two digits of precision.
* If there is not enough money in the account to complete the transaction, output the current bank balance.
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
