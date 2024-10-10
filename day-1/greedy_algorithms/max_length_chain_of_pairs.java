import java.util.*;

public class max_length_chain_of_pairs {
    public static void main(String[] args) {
        
        // Q.4) You are given n pairs of no. In every pair, the first no. is always smaller than the second no. A pair (c, d) can come after pair (a, b) if b < c. Find the longest chain which can be formed from a given set of pairs.

        /*
            pairs = 
            (5, 24)
            (39, 60)
            (5, 28)
            (27, 40)
            (50, 90)
        */

        int pair[][] = {
            {5, 24},
            {39, 60},
            {5, 28},
            {27, 40},
            {50, 90}
        };

        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int endEle = pair[0][1];

        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] > endEle) {
                chainLen++;
                endEle = pair[i][1];
            }
        }

        System.out.println("The Chain Length is: " + chainLen);
    }
}
