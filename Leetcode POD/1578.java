


class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int time = 0;
        int prevIdx = 0;

        // Time complexity is O(n)
        for(int i = 1; i < n; i++){
            char curr = colors.charAt(i);
            char prev = colors.charAt(prevIdx);

            if(curr == prev){

                // add min time
                time += Math.min(neededTime[prevIdx], neededTime[i]);

                // change prev according to compare
                if(neededTime[prevIdx] >= neededTime[i]){
                    prevIdx = prevIdx;
                }
                else{
                    prevIdx = i;
                }
            }
            else{
                prevIdx = i;
            }
        }


        return time;
    }
}