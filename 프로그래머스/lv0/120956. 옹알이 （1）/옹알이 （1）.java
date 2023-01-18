class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] check = new String[]{"aya", "ye", "woo", "ma"};
        for(var babble: babbling){
            int len = 0;
            for(var target: check){
                if(babble.indexOf(target) != -1)len += target.length();
            }
            if(babble.length() == len) answer++;
        }
        return answer;
    }
}