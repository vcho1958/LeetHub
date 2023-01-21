class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int received = (n / a)*b;
            answer += received;
            int tmp = n-(n/a*a);
            n = received + tmp;
        }
        return answer;
    }
}