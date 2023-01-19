class Solution {
    public int[] solution(int num, int total) {        
        int mid = total/num;
        int start = mid-num/2;
        if(num % 2 != 1)start+=1;
        int[] answer = new int[num];
        for(int i = 0; i< num; i++){
            answer[i] = start+i;
        }
        return answer;
    }
}