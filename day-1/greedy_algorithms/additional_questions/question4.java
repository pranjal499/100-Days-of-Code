import java.util.*;

public class question4 {
    public static void main(String arg[]) {

        // Q.4) Minimum Number of Stamps
        // You are given an infinite supply of stamps of different denominations. Your task is to find the minimum number of stamps needed to make a given postage value V.

        // stamps = [1, 5, 10, 25, 50]
        // V = 63;

        Integer stamps[] = {1, 5, 10, 25, 50};
        Arrays.sort(stamps, Collections.reverseOrder());

        int count = 0;
        int v = 63;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < stamps.length; i++) {
            if (stamps[i] <= v) {
                while (stamps[i] <= v) {
                    count++;
                    ans.add(stamps[i]);
                    v -= stamps[i];
                }
            }
        }

        System.out.println("The total no. of stamps are: " + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}