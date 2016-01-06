import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Problem https://www.codechef.com/problems/SUMTRIAN
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