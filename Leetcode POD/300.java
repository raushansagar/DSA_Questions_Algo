
/*
    ## 3000. Maximum Area of Longest Diagonal Rectangle
 */


 class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;

        for(int[] temp : dimensions){
            int l = temp[0];
            int w = temp[1];

            int area = l*w;
            double diagonal = Math.sqrt(((l*l) + (w*w)));

            
            if(maxDiagonal < diagonal){
                maxDiagonal = diagonal;
                maxArea = area;
            }
            else if(maxDiagonal == diagonal && maxArea < area){
                maxArea = area;
            }
        }


        return maxArea;
    }
}


