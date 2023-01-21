import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < score.length; i++){
            queue.add(score[i]);
            if(queue.size() > k)queue.remove();
            answer.add(queue.peek());
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}