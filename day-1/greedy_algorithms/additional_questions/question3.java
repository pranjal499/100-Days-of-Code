import java.util.*;

// package additional_questions;

public class question3 {
    public static void main(String[] args) {
        
        // Q.3) You are given n intervals, each defined by a start and end time. Your task is to find the maximum number of non-overlapping intervals that can be selected from the given set. An interval ((a, b)) is considered non-overlapping with another interval ((c, d)) if (b \leq c).

        /*
            intervals = [
                [1, 3],
                [2, 4],
                [3, 5],
                [7, 9],
                [5, 8]
            ]
        */

        int intervals[][] = {
            {1, 3},
            {2, 4},
            {3, 5}, 
            {7, 9},
            {5, 8}
        };

        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));

        int nonOver = 1;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                nonOver++;
                end = intervals[i][1];
            }
        }

        System.out.println("The total non - overlaping pairs are: " + nonOver);
    }
}
