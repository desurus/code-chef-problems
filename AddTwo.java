package info.desurus;

import java.util.*;

/**
 * Created by okryshch on 1/18/16.
 */
public class AddTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()){
            List<Integer> resultArray = new ArrayList<Integer>();
            String row = sc.nextLine();
            String[] parts = row.split(" ");
            for (int i = 0; i < (parts.length - 1); i++) {
                // lets add elements in parts in pairs
                int newSum = Integer.parseInt(parts[i]) + Integer.parseInt(parts[i + 1]);
                resultArray.add(newSum);
            }
            Collections.sort(resultArray);
            System.out.println(resultArray.get(resultArray.size() - 1));
        }
    }
}
