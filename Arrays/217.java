
// 217. Contains Duplicate


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mp = new HashSet<>();

        for(int k : nums){
            if(mp.contains(k)) return true;
            mp.add(k);
        }

        return false;
    }
}