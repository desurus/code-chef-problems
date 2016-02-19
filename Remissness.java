package info.desurus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Problem https://www.codechef.com/problems/REMISS
 */
public class Remissness {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int n = Integer.parseInt(sc.readLine());
        while (n > 0) {
            String row = sc.readLine();
            String[] parts = row.split(" ");
            int argOne = Integer.parseInt(parts[0]);
            int argTwo = Integer.parseInt(parts[1]);
            int maxTimes = argOne + argTwo;
            int minTimes = (argOne > argTwo) ? argOne : argTwo;
            pw.format("%d %d%n", minTimes, maxTimes);
            n--;
        }
    }
}
