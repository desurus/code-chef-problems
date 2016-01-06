import java.util.Scanner;
/*
* The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast
* to handle problems branded with the enormous Input/Output warning. You are expected to be able to process
* at least 2.5MB of input data per second at runtime.
*
* Input
*
* The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer
* ti, not greater than 109, each.
*
* Output
*
* Write a single integer to output, denoting how many integers ti are divisible by k.
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
