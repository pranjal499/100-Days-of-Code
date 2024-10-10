import java.util.*;

// package additional_questions;

public class indian_coins {
    public static void main(String[] args) {
        
        // Q.4) Indian coins:
        // We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000]. Find min. no. of coins/notes to make change for a value V.

        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int count = 0;
        int amount = 590;

        Arrays.sort(coins, Collections.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total no. of coins is: " + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
