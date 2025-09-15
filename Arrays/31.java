// 31. Next Permutation

import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int idx = n-1;
        List<Integer> pq = new ArrayList<>();

        while(idx >= 0){
            if(idx > 0 && nums[idx-1] >= nums[idx]){
                pq.add(nums[idx]);
                idx--;
            }
            else{
                pq.add(nums[idx]);
                idx--;
                break;
            }
        }

        int j = idx;
        int k = 0;
        for(int i = idx+1; i < n; i++){
            
            //swap
            if(j != -1 && nums[j] < pq.get(k)){
                int temp = nums[j];
                nums[j] = pq.get(k);
                pq.set(k, temp);
                j = -1;
            }

            nums[i] = pq.get(k);
            k++;
        }


    }
}