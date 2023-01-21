import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < quiz.length; i++){
            String[] symbols = quiz[i].split(" ");
            int correct = calculate(symbols[0], symbols[1], symbols[2]);
            if(correct == Integer.valueOf(symbols[4]))answer.add("O");
            else answer.add("X");
        }
        return answer.toArray(new String[0]);
    }
    
    private int calculate(String left, String term, String right){
        
        switch(term){
            case "+":
                return Integer.valueOf(left)+Integer.valueOf(right);
            case "-":
                return Integer.valueOf(left)-Integer.valueOf(right);
        }
        return 0;
    }
}