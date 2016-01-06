import java.util.Scanner;

/**
 * Problem https://www.codechef.com/problems/TEST
 */
class LifeUniverseEverything {
	public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
        while(true) {
            while (!in.hasNextInt()){
                in.next();
            }
            int a = in.nextInt();
            in.nextLine();
            if (0 <= a && a <= 99){
                if (a == 42){
                    break; 
                }
                System.out.println(a);
            }
        }
	}
}
