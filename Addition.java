package info.desurus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;

/**
 * Problem https://www.codechef.com/problems/FLOW001
 */
public class Addition {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int n = Integer.parseInt(sc.readLine());
        while (n > 0) {
            String row = sc.readLine();
            String[] parts = row.split(" ");
            pw.println(Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]));
            n--;
        }
    }
}
