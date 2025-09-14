
    // Weekly Contest 467

    // 3683. Earliest Time to Finish One Task
    // 3684. Maximize Sum of At Most K Distinct Elements
    // 3685. Subsequence Sum After Capping Elements
    // 3686. Number of Stable Subsequences






import java.util.*;
// 3683. Earliest Time to Finish One Task
class Solution {
    public int earliestTime(int[][] tasks) {
        int minTime = Integer.MAX_VALUE;

        for(int[] d : tasks){
            minTime = Math.min(minTime, (d[0]+d[1]));
        }

        return minTime;
    }
}



// 3684. Maximize Sum of At Most K Distinct Elements
class Solution2{
    public int[] maxKDistinct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int val : nums){
            if(!pq.contains(val)) pq.add(val);
        }

        int[] result = new int[Math.min(k, pq.size())];
        int idx = 0;

        while(!pq.isEmpty() && idx < k){
            if(idx > 0 && pq.peek() == result[idx-1]){
                pq.poll();
            }
            else{
                result[idx++] = pq.poll();
            }
        }

        return result;
    }
}