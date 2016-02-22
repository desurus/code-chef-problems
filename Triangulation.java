package info.desurus;

import java.awt.*;
import java.util.Scanner;

/**
 * Problem https://www.codechef.com/status/COMM3
 */
public class Triangulation {
    public static float findDistance(Point a, Point b) {
        return (float) Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();
            while (n > 0) {
                int R = sc.nextInt();
                Point[] position = new Point[3];
                for (int i = 0; i < 3; i++) {
                    position[i] = new Point(sc.nextInt(), sc.nextInt());
                }
                int counter = 0;
                if (findDistance(position[0], position[1]) <= R) {
                    counter++;
                }
                if (findDistance(position[1], position[2]) <= R) {
                    counter++;
                }
                if (findDistance(position[2], position[0]) <= R) {
                    counter++;
                }
                if (counter >= 2) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
                n--;
            }
        }
    }
}
