// Leetcode 966
// Link :- https://leetcode.com/problems/vowel-spellchecker/?envType=daily-question&envId=2025-09-14


import java.util.*;
class Solution {
    private String changeVowel(String s){
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                str.append('*');
            }
            else{
                str.append(ch);
            }
        }

        return str.toString();
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        int n = queries.length;
        int m = wordlist.length;

        String[] result = new String[n];
        Set<String> case1 = new HashSet<>();
        Map<String, String> case2 = new HashMap<>();
        Map<String, String> case3 = new HashMap<>();

        for(int i = 0; i < m; i++){
            String s1 = wordlist[i];
            String s2 = s1.toLowerCase();
            String s3 = changeVowel(s1.toLowerCase());

            case1.add(s1);
            if(!case2.containsKey(s2)) case2.put(s2, s1);
            if(!case3.containsKey(s3)) case3.put(s3, s1);
        }

        for(int i = 0; i < n; i++){
            String s = queries[i];
            String changeQuerie = changeVowel(s.toLowerCase());

            // case 1 both string are same 
            if(case1.contains(s)){
                result[i] = s;
            } // case 2 both string are same but diff in capitalization 
            else if(case2.containsKey(s.toLowerCase())){
                result[i] = case2.get(s.toLowerCase());
            } // case 3 change only vowel letter 
            else if(case3.containsKey(changeQuerie)){
                result[i] = case3.get(changeQuerie);
            }
            else{ // not match
                result[i] = "";
            }
        }


        return result;
    }
}