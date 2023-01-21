class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int x = 0;
        int num = 0;
        String[] symbols = polynomial.split(" ");
        for(int i = 0; i < symbols.length; i+=2){
            if(symbols[i].lastIndexOf('x') == -1)num += Integer.valueOf(symbols[i]);
            else {
                if(symbols[i].equals("x"))x+=1;
                else x += Integer.valueOf(symbols[i].substring(0, symbols[i].length()-1));}
        }
        if(x > 0){
            if(x > 1)answer.append(x);
            answer.append("x");
        }
        if(x > 0 && num > 0)answer.append(" + ");
        if(num > 0)answer.append(num);
        return answer.toString();
    }
}