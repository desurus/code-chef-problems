import java.util.Scanner;

/**
 * Problem https://www.codechef.com/problems/PERMUT2
 */
class AmbiguousPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
			if (sc.hasNextInt()){
				int n = sc.nextInt();
				sc.nextLine();
				if (n == 0) {
					System.exit(0);
				}
			
				boolean ambiguous = true;

				if (sc.hasNextLine()) {
					String[] permutation = sc.nextLine().split(" ");
					for (int i = 0; i < n; i++){
						if (Integer.parseInt(permutation[Integer.parseInt(permutation[i]) - 1 ]) - 1 != i) {
							System.out.println("not ambiguous");
							ambiguous = false;
							break;
						}
					}
					if (ambiguous) {
						System.out.println("ambiguous");
					}
				}
			}
        }
    }
}
