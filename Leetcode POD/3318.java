
// 3318. Find X-Sum of All K-Long Subarrays I


import java.util.*;
class Solution {
    private int findXSum(Map<Integer, Integer> map, int x){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[1] != b[1]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        // O(k * log(k))
        for(int key : map.keySet()){
            pq.add(new int[]{key, map.get(key)});

            if(pq.size() > x){
                pq.poll();
            }
        }

        // O(logk)
        int sum = 0;
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            sum += temp[0] * temp[1];
        }

        return sum;
    }
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[n-k+1];

        // Time Complexity  O(n * k log(k))
        int i = 0, j = 0;
        while(i < n){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(i-j+1 == k){
                result[j] += findXSum(map, x);

                map.put(nums[j], map.getOrDefault(nums[j], 0) - 1);
                if(map.get(nums[j]) <= 0){
                    map.remove(nums[j]);
                }
                j++;
            }
            i++;
        }


        return result;
    }
}