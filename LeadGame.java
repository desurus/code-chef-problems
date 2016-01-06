import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

/**
 * Problem https://www.codechef.com/problems/TLG
 */
class LeadGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        String count = br.readLine();
		if (count != null && !count.isEmpty()) {
			int n = Integer.parseInt(count);
			ArrayList<Integer> play1adv = new ArrayList<Integer>();
			ArrayList<Integer> play2adv = new ArrayList<Integer>();
			int play1total = 0;
			int play2total = 0;

            while (n > 0) {
				String line = br.readLine();
				if (line != null && !line.isEmpty()) {
					String[] parts = line.split(" ");
					int play1 = Integer.parseInt(parts[0]);
					int play2 = Integer.parseInt(parts[1]);
					
					play1total = play1total + play1;
					play2total = play2total + play2;
					
					pw.println("Player 1 total: " + play1total);
					pw.println("Player 2 total: " + play2total);

					if (play1total > play2total) {
						play1adv.add((play1total - play2total));
					} else if (play2total > play1total) {
						play2adv.add((play2total - play1total));
					}
					n--;
				}

			}
		
			Collections.sort(play1adv);
			Collections.sort(play2adv);
			
			int play1top = 0;
			int play2top = 0;
		
			if (play1adv.size() > 1) {
				play1top = play1adv.get(play1adv.size() - 1);
			} else if (play1adv.size() == 1) {
				play1top = play1adv.get(0);
			}
			
			if (play2adv.size() > 1) {
				play2top = play2adv.get(play2adv.size() - 1);
			} else if (play2adv.size() == 1) {
				play2top = play2adv.get(0);
			}
		
			if (play1top > play2top) {
				pw.println("1 " + play1top);
			} else if (play2top > play1top) {
				pw.println("2 " + play2top);
			}
		}
    }
}
