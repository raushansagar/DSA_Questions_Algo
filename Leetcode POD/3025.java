

// 3025. Find the Number of Ways to Place People I

import  java.util.*;
class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;

        // Sort: x ascending, if x same then sort y descending
        Arrays.sort(points, (point1, point2) -> {
            if (point1[0] == point2[0]) {
                return point2[1] - point1[1];
            }
            return point1[0] - point2[0];
        });

        int result = 0;

        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];   // upper left

            int bestY = Integer.MIN_VALUE;

            for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];   // lower right

                // Skip if point j is above point i
                if (y2 > y1) continue;

                // Count only if this y2 is the highest so far among valid points
                if (y2 > bestY) {
                    result++;
                    bestY = y2;
                }
            }
        }

        return result;
    }
}