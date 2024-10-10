import java.util.*;

public class chocola_problem {
    public static void main(String[] args) {
        
        // Q.7) We are given a bar of chocolate composed of m x n sq. pieces. One should break the chocolate into single sq. Each break of a part of the chocolate is changed a cost expressed by a positive integer. This cost does not depend on the size of the part that is beeing broken but only depends on the line the break goes along. Let us denote the cost of breaking along consecutive vertical lines with x1, x2, ..., .m-1 and along horizontal lines with y1, y2,..., yn-1. compute the minimal cost of breaking the whole chocolate into singel square.

        Integer costVer[] = {2, 1, 3, 1, 4}; // m - 1
        Integer costHor[] = {4, 1, 2}; // n - 1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        // pointer variable:
        int h = 0, v = 0;
        
        // parts count:
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);
                hp++; h++;
            }
            else {
                cost += (costVer[v] * hp);
                vp++; v++;
            }
        }

        // Rest items:
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++; h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++; v++;
        }

        System.out.println("Minimum cost of cut is: " + cost);
    }
}
