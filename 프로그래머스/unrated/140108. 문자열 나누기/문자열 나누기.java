class Solution {
    public int solution(String s) {
        int answer = 0, same = 1, diff = 0;
        char c = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(same == 0){
                c = s.charAt(i);
            }
            char target = s.charAt(i);
            if(target == c)same++;
            else diff++;
            if(same == diff){
                answer++;
                same = 0;
                diff = 0;
            }
        }
        if(same > 0)answer++;
        return answer;
    }
}