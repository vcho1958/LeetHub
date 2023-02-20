class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
        vector<vector<int>> answer(2,vector<int>());
        map<int,int> cnt;         
        for(auto& m : matches){
            if(cnt.find(m[0]) == cnt.end())cnt[m[0]] = 0;
            if(cnt.find(m[1]) == cnt.end())cnt[m[1]] = 0;
            cnt[m[1]] += 1;
        }
        for(auto& c:cnt){
            if(c.second == 0)answer[0].push_back(c.first);
            if(c.second == 1)answer[1].push_back(c.first);
        }
        return answer;
        
    }
};