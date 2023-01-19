import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] check = new int[201];
        for(var line: lines){
            for(int i = line[0]; i < line[1]; i++){
                check[i+100]++;
            }
        }
        for(var c:check)if(c>1)answer++;
        return answer;
    }
}