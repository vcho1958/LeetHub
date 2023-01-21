
import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> answer =Arrays.stream(numlist)
                        .boxed()
                        .collect(Collectors.toList());
        // Collections.sort(answer, (l1,l2)->abs(l1-n)-abs(l2-n));
        return answer.stream().sorted((l1,l2)->{
            if(abs(l1-n)-abs(l2-n) != 0)
            return abs(l1-n)-abs(l2-n);
            return l2-l1;
            }).mapToInt(Integer::intValue).toArray();
    }
    
    private int abs(int a){
        return a > 0 ? a : -a;
    }
}