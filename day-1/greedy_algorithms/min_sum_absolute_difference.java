

public class min_sum_absolute_difference {
    public static void main(String[] args) {
        
        // Q.3) Min Absolute difference Pairs:
        // Fiven two arrays A and B of equal length n. Pair each element of array A to an element in array B, such that sum S of absolute differences of all the pairs is minimum.

        int A[] = {1, 4, 7, 8};
        int B[] = {2, 3, 5, 6};

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("The Minimum Absolute difference is: " + minDiff);
    }
}
