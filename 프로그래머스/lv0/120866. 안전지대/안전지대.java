class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] board2 = new int[board.length][board.length];
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    if(i>0){
                        if(j > 0)board2[i-1][j-1] = 1;
                        board2[i-1][j] = 1;
                        if(j < board2.length-1)board2[i-1][j+1] = 1;
                    }
                    if(i<board2.length-1){
                        if(j > 0)board2[i+1][j-1] = 1;
                        board2[i+1][j] = 1;
                        if(j < board2.length-1)board2[i+1][j+1] = 1;
                    }
                    if(j > 0)board2[i][j-1] = 1;
                    board2[i][j] = 1;
                    if(j < board2.length-1)board2[i][j+1] = 1;
                }
            }
        }
        for(var row: board2)for(var point: row)if(point == 0)answer++;
        return answer;
    }
}