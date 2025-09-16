// Leetcode 2197
// Link :- https://leetcode.com/problems/replace-non-coprime-numbers-in-array/?envType=daily-question&envId=2025-09-16



class Solution {
    private long findGCD(long a, long b){

        while(b != 0){
            long temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> result = new ArrayList<>();
        result.add(nums[0]);

        for(int i = 1; i < nums.length; i++){
            int val = nums[i];

            while(!result.isEmpty()){
                int prev = result.get(result.size()-1);
                long gcd = findGCD((long)val, (long)prev);
                long lcm = ((long)prev/gcd) * val;

                if(gcd == 1) break;
                result.remove(result.size()-1);
                val = (int)lcm;
            }

            result.add(val);
        }

        return result;
    }
}