// package additional_questions;
import java.util.*;

public class question1 {
    public static void main(String[] args) {
        // Q.1) You are given n meatings with their starting and ending time. Your task is to schedule maximum number of non-overlaping meadings that can be held in a single meating room, prioritize meeting of shorter duration. Assume that the meeting room can only host one meeting at a time.


        int start[] = {1, 2, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        int maxMeeting = 1;;
        ArrayList<Integer> ans = new ArrayList<>();
        if (start.length == 0 || end.length == 0) {
            maxMeeting = 0;
        }
        int endTime = end[0];
        ans.add(0);

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= endTime) {
                ans.add(i);
                maxMeeting++;
                endTime = end[i];
            }
        }

        System.out.println("The maximum no. of meeting is " + maxMeeting);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}

// Approch to solve the problem:
/*
    start = [1, 2, 0, 5, 8, 5] --> Starting time
    end = [2, 4, 6, 7, 9, 9] --> Ending time

    - Variable containing maximum number of meetings --> initilize with 1
    - Considering first pair by default
    - Check wheather the next pair's starting time is greater than last chosen's end time
    - if not overlaping then choose that pair else not
    - While choosing the pair increment the maxMeeting variable by one
    - Create an arraylist containg the meeting record 
    - While incrementing the maxMeeting variable also concatinate that with meeting no.
    - At the end return maxMeeting and meeting record --> arraylist of meeting record.
*/
