
class Solution {
public:
    int findMinFibonacciNumbers(int k) {
       int dp[1000000] = {0};
       dp[0] = 0;
       dp[1] = 1;
       int cnt = 0;
       
       while(k){
           int index = getLastIndex(k, dp);
           k -= dp[index-1];
           cnt++;
       }
        return cnt;
    }
    int getLastIndex(int k, int* dp){
        for(int i = 2; i < 1000000; i++){
            dp[i] = dp[i-1]+dp[i-2];
            if(dp[i] > k){
                return i;
            }
        }
        return -1;
    }
};