class Solution {
public:
    int maxFreqSum(string s) {
        map<char, int> mp;

        for(int i = 0; i < s.size(); i++){
            char ch = s[i];
            mp[ch]++;
        }

        int cons = 0;
        int vowel = 0;
        
        for(auto& p : mp){
            if(p.first == 'a' || p.first == 'e' || p.first == 'i' || p.first == 'o' || p.first == 'u'){
                vowel = max(vowel, p.second);
            }
            else{
                cons = max(cons, p.second);
            }
        }


        return cons + vowel;
    }
};