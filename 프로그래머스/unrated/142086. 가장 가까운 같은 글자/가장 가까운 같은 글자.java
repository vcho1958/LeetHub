import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        int[] alp = new int[26];
        Arrays.fill(alp, -1);
        for(int i = 0; i < s.length(); i++){
            if(alp[s.charAt(i)-'a'] == -1)answer.add(-1);
            else answer.add(i-alp[s.charAt(i)-'a']);
            alp[s.charAt(i)-'a'] = i;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}