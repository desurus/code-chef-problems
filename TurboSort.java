import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;

/**
 * Problem https://www.codechef.com/problems/TSORT
 */
class TurboSort {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		int[] a = new int[n];
		do {
			int number = Integer.parseInt(sc.readLine());
			n--;
			a[n] = number;
		} while (n > 0);
		Arrays.sort(a);
		PrintWriter pw = new PrintWriter(System.out, true);
		for (Integer number : a){
			pw.println(number);
		}
    }
}
