class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int sub = common[1]-common[0];
        if(common.length == 2)return common[1]+sub;
        if(sub != common[2]-common[1])return common[common.length-1]* (common[2]-common[1])/sub;
        return common[common.length-1]+sub;
    }
}