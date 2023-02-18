class Solution {
public:
    bool areOccurrencesEqual(string s) {
        int cnt[26] = {0,}, max = 0;
        for(auto& c : s){
            cnt[c-'a']++;
        }
        for(auto& m: cnt){
            if(!m)continue;
            if(max == 0) max = m;
            if(m != max)return false;
        }
        return true;
    }
};