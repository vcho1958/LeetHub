class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int[] cnt = new int[1000];
        int max = 0;
        for(var num:array){
            cnt[num]++;
            if(cnt[num] > max){
                answer = num; 
                max = cnt[num];
            }
            else if(cnt[num] == max)answer = -1;
        }
        return answer;
    }
}