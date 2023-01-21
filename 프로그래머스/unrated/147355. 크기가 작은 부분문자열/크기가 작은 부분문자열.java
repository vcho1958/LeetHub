class Solution {
    long pValue;
    public int solution(String t, String p) {
        final long mul = getCountOfNumber(p);
        int cnt = 0;
        long answer = Long.valueOf(t.substring(0, p.length()));
        pValue = Long.valueOf(p);
        if(checkAnswer(answer))cnt++;
        for(int i = p.length(); i < t.length(); i++){
            answer-=(t.charAt(i-p.length())-'0')*mul;
            answer *= 10;
            answer += t.charAt(i)-'0';
            if(checkAnswer(answer))cnt++;
        }
        return cnt;
    }
    
    private long getCountOfNumber(String p){
        long c = 1;
        for(int i = 0 ; i < p.length()-1; i++){
            c *= 10;
        }
        return c;
    }
    
    private boolean checkAnswer(long answer){
        return answer <= pValue;
    }
}