import java.util.*;

public class fractional_knapeack {
    public static void main(String[] args) {
        
        // Q.2) Fractional Knapsack:
        // Given the weight and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
        // value = [60, 100, 120]
        // weight = [10, 20, 30]
        // W = 50

        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[value.length][2];
        // 0th col --> idx; 1sth col --> ratio

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i; // Storing idx
            ratio[i][1] = value[i] / (double)weight[i];
        }

        // Sort in assending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalValue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {
                finalValue += value[idx];
                capacity -= weight[idx];
            }
            else {
                // include fractional
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value is: " + finalValue);
    }
}
