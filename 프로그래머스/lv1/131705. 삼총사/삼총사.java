class Solution {
    boolean[] check;
    public int solution(int[] number) {
        int answer = 0;
        check = new boolean[number.length];
        return bfs(number, 0, 0, 0);
    }
    
    private int bfs(int[] number, int from, int cnt, int target){
        if(cnt == 3){
            if(target == 0)return 1;
            return 0;
        }
        int sum = 0;
        for(int i = from; i < number.length; i++){
            if(check[i])continue;
            check[i] = true;
            sum += bfs(number, i+1, cnt+1, target+number[i]);
            check[i] = false;
        }
        return sum;
    }
}