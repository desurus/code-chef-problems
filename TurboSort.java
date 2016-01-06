import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
/*
* Given the list of numbers, you are to sort them in non decreasing order.
*
* Input
*
* t – the number of numbers in list, then t lines follow [t <= 10^6].
* Each line contains one integer: N [0 <= N <= 10^6]
*
* Output
*
* Output given numbers in non decreasing order.
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
