// package greedy_algorithms;
import java.util.*;

public class activity_selection {
    public static void main(String[] args) {
        
        // Q.1) Activity Selection:
        // You are given n activities with their start and end and times. Select the minimum no. of activity that can be performed by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time. 
        // start = [10, 12, 20]
        // end = [20, 25, 30]

        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;

        // 1st activity:
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("The max activity is = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i) + " ");
        }

    }
}
