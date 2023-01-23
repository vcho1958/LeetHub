import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[][] score) {
        List<int[]> list2 = Arrays.asList(score);
        final Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = list2.stream().map(l1->l1[0]+l1[1]).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        for(int i = 0; i < list.size();i++){
            if(!map.containsKey(list.get(i)))map.put(list.get(i), i+1);
        }
        return list2.stream().mapToInt(i->map.get(i[0]+i[1])).toArray();
    }
}