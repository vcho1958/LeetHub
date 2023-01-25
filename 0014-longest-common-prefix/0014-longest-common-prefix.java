class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Map<String, Integer> map = new HashMap<>();
        
        // int longestSize = 0;
        // String answer = null;
        //문자열을 탐색하면서 부분문자열을 맵에 저장한다. 
        //이미 있다면 value+1
        //해당 문자열의 길이가 longestSize보다 길고 value가 strs 원소 개수와 같다면 longestSize와 answer을 갱신한다.
        //strs의 원소개수를 N, 가장 긴 원소의 길이를 M이라 할 때 원소 순회 N, 각 원소별로 모든 연속부분문자열을 구하는데 M^2이므로 시간복잡도는 O(NM^2)이다.
        //200*200*200 8000000으로 1억보다 작으므로 1ms를 만족할 수 있다.

        //문제 해석 이슈: 부분문자열인줄 알았더니 prefix였다. 어쩐지 레벨 1문제가 이런게 나올리가 없었다..
        // for(var word:strs){
        //     Map<String, Boolean> map2 = new HashMap<>();
        //     for(int i = 0; i < word.length(); i++){
        //         StringBuilder tmp = new StringBuilder();
        //         for(int j = i; j < word.length(); j++){
        //             tmp.append(word.charAt(j));
        //             String key = tmp.toString();
        //             if(map2.containsKey(key))continue;
        //             if(!map.containsKey(key))map.put(key, 0);
        //             if(!map2.containsKey(key))map2.put(key,true);
        //             var value = map.get(key)+1;
        //             map.put(key, value);
        //             if(value == strs.length && key.length() > longestSize){
        //                 longestSize = key.length();
        //                 answer = key;
        //             }
        //         }
        //     }
        // }

        StringBuilder answer = new StringBuilder("");
        for(int i = 0; i < strs[0].length(); i++){
            char a = strs[0].charAt(i);
            for(var str: strs)if(str.length() <= i || str.charAt(i)!=a)return answer.toString();
            answer.append(a);
        }
        return answer.toString();
    }
}