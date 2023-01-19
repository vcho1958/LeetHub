class Solution {
    String[] ex = new String[]{"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        for(var ba: babbling){
            if(checkEx(ba)){
                // System.out.println(ba);
                answer++;
            }
        }
        return answer;
    }
    
    private boolean checkEx(String ba){
        int cnt = 0;
        String before = "";
        for(int i = 0; i < ba.length();i++){
            int beforeIndex = i;
            for(var e: ex){
                if(e == before || i+e.length() > ba.length()) continue;
                if(ba.indexOf(e, i) == i){
                    i += e.length()-1;
                    before = e;
                    break;
                }
            }
            if(beforeIndex == i)return false;
        }
        return true;
    }
}