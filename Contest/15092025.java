
    // Weekly Contest 467

    // 3683. Earliest Time to Finish One Task
    // 3684. Maximize Sum of At Most K Distinct Elements
    // 3685. Subsequence Sum After Capping Elements
    // 3686. Number of Stable Subsequences






import java.util.*;
// 3683. Earliest Time to Finish One Task
class Solution1 {
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




// Weekly Contest 475
// 3742. Maximum Path Score in a Grid
// 3743. Maximize Cyclic Partition Score



// 3740. Minimum Distance Between Three Equal Elements I
class Solution3{
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int result = -1;

        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(nums[i] == nums[j] && nums[j] == nums[k]){
                        if(result == -1) result = Integer.MAX_VALUE;
                        int dis = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                        result = Math.min(result, dis);
                    }
                }
            }
        }


        return result;
    }
}




// 3741. Minimum Distance Between Three Equal Elements II
class Solution4{
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, TreeSet<Integer>> left = new HashMap<>();
        Map<Integer, TreeSet<Integer>> right = new HashMap<>();
        left.computeIfAbsent(nums[0], k -> new TreeSet<>()).add(0);

        for(int i = n-1; i >= 1; i--){
            int key = nums[i];
            int val = i;
            right.computeIfAbsent(key, k -> new TreeSet<>()).add(val);
        }

        int result = Integer.MAX_VALUE;
        for(int i = 1; i < n-1; i++){
            int key = nums[i];

            // remove right side
            right.get(key).remove(i);
            if(right.get(key).isEmpty()){
                right.remove(key);
            }
            
            // find min distance
            if(left.containsKey(key) && right.containsKey(key)){
                TreeSet<Integer> l = left.get(key);
                TreeSet<Integer> r = right.get(key);

                int dis = Math.abs(l.last() - i) + Math.abs(i - r.first()) + Math.abs(r.first() - l.last());
                result = Math.min(result, dis);
            }

            // add left side 
            left.computeIfAbsent(key, k-> new TreeSet<>()).add(i);
        }
        

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}