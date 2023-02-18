class Solution {
    public int[] plusOne(int[] digits) {
        int acc = 1;
        for(int i = digits.length-1; i >= 0 && acc > 0; i--){
            int digit = digits[i];
            digit += 1;
            acc = 0;
            if(digit == 10){
                acc+=1;
                digit = 0;
            }
            digits[i] = digit;
        }
        if(acc == 1){
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            for(int i = 0; i < digits.length; i++)arr[i+1] = digits[i];
            digits = arr;
        }
        return digits;
    }
}