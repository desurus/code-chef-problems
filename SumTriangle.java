import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/*
* Let's consider a triangle of numbers in which a number appears in the first line, two numbers appear in the second
* line, three in the third line, etc. Develop a program which will compute the largest of the sums of numbers that
* appear on the paths starting from the top towards the base, so that:
* on each path the next number is located on the row below, more precisely either directly below or below and one place
* to the right;
* the number of rows is strictly positive, but less than 100
* all numbers are positive integers between O and 99.
*
* Input
*
* In the first line integer n - the number of test cases (equal to about 1000). Then n test cases follow.
* Each test case starts with the number of lines which is followed by their content.
*
* Output
*
* For each test case write the determined value in a separate line.
*/
class SumTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            List<Integer> result = new ArrayList<Integer>();
            
            // loop over number of tests
            do {
                if (sc.hasNextInt()){
                
                    // lets get number of rows of the next triangle
                    int k = sc.nextInt();
                    sc.nextLine();
                    // lets initiate starting index
                    int index = 0;
                    // and the test sum
                    int testSum = 0;
                    
                    // loop over triangle rows
                    do {
                    	if (sc.hasNext()){
                    		String row = sc.nextLine();
                    		String[] parts = row.split(" ");
                    		
                    		// lets get value on the index position
                    		if (parts.length > 1 && parts[1] != null && parts.length != 2) {
                    			int positionIndex = Integer.parseInt(parts[index]);
                    			int positionPlusOne = Integer.parseInt(parts[index + 1]);
                    			
                    			if (positionIndex >= positionPlusOne) {
                    				testSum = testSum + positionIndex;
                    				
                    			} else if (positionIndex < positionPlusOne) {
                    				testSum = testSum + positionPlusOne;
                    				index = index + 1;
                    			}
                    			
                    		} else {
                    			testSum = testSum + Integer.parseInt(parts[0]);
                    		}
                    		
                    		k--;	
                    	}
                    
                    } while (k > 0);
                    
                    result.add(testSum);
                    
                    n--;
                
                } else {
                    sc.next();
                }
                
            } while (n > 0);
            
            // print out the results
            for (Integer sums : result){
                System.out.println(sums);
            }
        }
    }
}