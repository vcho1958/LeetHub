class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            int cnt = getDividerCnt(i);
            if(cnt > limit)answer += power;
            else answer += cnt;
        }
        return answer;
    }
    
    private int getDividerCnt(int n){
        int cnt = 0;
        for(int i = 1; i * i <= n ; i++){
            if(n % i == 0){
                cnt++;
                if(i*i != n)cnt++;
            }
            
        }
        return cnt;
    }
}