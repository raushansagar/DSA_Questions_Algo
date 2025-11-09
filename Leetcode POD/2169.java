// 2169. Count Operations to Obtain Zero


class Solution {
    public int countOperations(int num1, int num2) {
        int noOfOperations = 0;

        while(num1 > 0 && num2 > 0){
            noOfOperations++;

            if(num1 >= num2){
                num1 = num1-num2;
            }
            else{
                num2 = num2-num1;
            }
        }



        return noOfOperations;
    }
}