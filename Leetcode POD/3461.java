// 3461. Check If Digits Are Equal in String After Operations I

class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length() > 2){
            StringBuilder str = new StringBuilder();

            for(int i = 1; i < s.length(); i++){
                int num = (int)(s.charAt(i-1)-'0') + (int)(s.charAt(i)-'0');
                num = num%10;
                str.append(num);
            }
            s = str.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }
}