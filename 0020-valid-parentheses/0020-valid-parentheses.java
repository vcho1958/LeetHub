class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(var ch: s.toCharArray()){
            switch(ch){
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.size()>0 &&stack.peek() == '(')stack.pop();
                    else return false;
                    break;
                case '}':
                    if(stack.size()>0 &&stack.peek() == '{')stack.pop();
                    else return false;
                    break;
                case ']':
                    if(stack.size()>0 &&stack.peek() == '[')stack.pop();
                    else return false;
            }
        }
        if(stack.size() > 0)return false;
        return true;
    }
}