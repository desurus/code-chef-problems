import java.util.Scanner;
/*
* Write a program to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything.
* More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42.
* All numbers at input are integers of one or two digits.
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
