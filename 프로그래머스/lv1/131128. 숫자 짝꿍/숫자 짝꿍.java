class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] cntx = new int[10];
        int[] cnty = new int[10];
        for(var x:X.toCharArray())cntx[x-'0']++;
        for(var y:Y.toCharArray())cnty[y-'0']++;
        for(int i = 9; i >= 0; i--){
            int amount = cntx[i] > cnty[i] ? cnty[i] : cntx[i];
            while(amount-- > 0){
                if(answer.length() == 1 && i == 0 && answer.charAt(0) == '0')continue;
                answer.append(i);
            }
        }
        if(answer.length() == 0)return "-1";
        return answer.toString();
    }
}