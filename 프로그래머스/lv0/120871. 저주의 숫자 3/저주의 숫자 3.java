class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] sheet = new int[102];
        int target = 1;
        for(int i = 1; i <= 100; i++, target++){
            while(checkTarget(target)){
                target++;
            }

            sheet[i] = target;
        }
        return sheet[n];
    }
    
    private boolean checkTarget(int target){
        if(target%3 == 0) return true;
        while(target> 0){
            if((target%10) == 3)return true;
            target/=10;
        }
        return false;
    }
}