import java.util.*;
class Solution {
    int[] order = new int[]{1,2,3,1};
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        for(var i: ingredient){
            if(i == 1 && s.size() >= 3 && s.lastIndexOf(3) == s.size()-1 && s.lastIndexOf(2) == s.size()-2 && s.lastIndexOf(1) == s.size()-3){
                s.pop();
                s.pop();
                s.pop();
                answer+=1;
            }else s.push(i);
        }
        return answer;
    }
}