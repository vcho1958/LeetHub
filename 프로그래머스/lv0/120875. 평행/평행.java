class Solution {
    int[][] dots;
    public int solution(int[][] dots) {
        int answer = 0;
        this.dots = dots;
        if(cmpIncline(getLine(0,1),getLine(2,3)))answer++;

        return answer;
    }
    
    private int[][] getLine(int i, int j){
        return new int[][]{dots[i], dots[j]};
    }
    
    private boolean cmpIncline(int[][] line1, int[][] line2){
        return getAbs(getValue(line1,line2)) - getAbs(getValue(line2,line1)) == 0;
    }
    
    private int getValue(int[][] line1, int[][] line2){
        return (line2[1][1] - line2[0][1]) * (line1[1][0] - line1[0][0]);
    }
    private int getAbs(int v){
        return v > 0 ? v : -v;
    }
    //x2-x1/y2-y1   = 
    
}