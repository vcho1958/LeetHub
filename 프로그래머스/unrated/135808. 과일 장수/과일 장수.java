import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = 0; i < score.length/m; i++){
            answer += score[score.length-1-i*m-m+1]*m;
        }
        return answer;
    }
}