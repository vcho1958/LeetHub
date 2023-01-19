class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = GCD(denom1, denom2);
        int[] answer = {numer1*denom2/gcd+numer2*denom1/gcd,getDenom(denom1,denom2)};
        gcd = GCD(answer[0], answer[1]);
        return new int[]{answer[0]/gcd, answer[1]/gcd};
    }
    
    private int getDenom(int a, int b){
        int gcd = GCD(a, b);
        return a*b/gcd;
    }
    private int GCD(int a, int b){
        int n = a % b;
        if(n == 0)return b;
        return GCD(b,n);
    }
}