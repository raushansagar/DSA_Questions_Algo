// GFG Min and Max in Array



class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        
        return new Pair(min, max);
    }
}