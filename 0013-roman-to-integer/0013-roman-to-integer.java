class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int sum = 0, tmp = 0;
        Character before = null;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(before != null && before != a){
                if(roman.get(before) < roman.get(a)) {
                    sum -= tmp;
                    tmp = 0;
                }
                if(roman.get(before) > roman.get(a)) {
                    sum += tmp;
                    tmp = 0;
                }
            }
            tmp += roman.get(a);
            before = a;
        }
        return sum+ tmp;
    }
}