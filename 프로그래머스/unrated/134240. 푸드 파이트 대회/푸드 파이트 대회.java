class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            for(int j = 1; j < food[i]; j+=2){
                answer.append(i);
            }
        }
        StringBuilder reversed = new StringBuilder(answer);
        answer.append('0');
        reversed.reverse();
        answer.append(reversed);
        return answer.toString();
    }
}