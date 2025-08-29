
// Leetcode 3021 Maths
// time complexity of this code is o(1)

class Solution {
    public long flowerGame(int n, int m) {
        long count = 0;

        // First Land 
        long noOfEvenFirstLand = n/2;
        long noOfOddFirstLand = n - noOfEvenFirstLand;

        // Second Land
        long noOfEvenSecondLand = m/2;
        long noOfOddSecondLand = m - noOfEvenSecondLand;

        count += ((noOfEvenFirstLand * noOfOddSecondLand) + (noOfOddFirstLand * noOfEvenSecondLand));

        return count;
    }
}




// Leetcode 3021 Maths
// time complexity of this code is o(n*m)

class Solution2{
    public long flowerGame(int n, int m) {
        long count = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if((i+j)%2 == 1){
                    count++;
                }
            }
        }

        return count;
    }
}