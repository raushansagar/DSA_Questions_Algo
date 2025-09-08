

class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        for(int i = 1; i < n; i++){
            String s1 = String.valueOf(n-i);
            String s2 = String.valueOf(i);

            if(!s1.contains("0") && !s2.contains("0")){
                return new int[]{(n-i), i};
            }
        }

        return new int[] {n/2, (n%2 == 1 ? n/2 + 1 : n/2)};
    }
}