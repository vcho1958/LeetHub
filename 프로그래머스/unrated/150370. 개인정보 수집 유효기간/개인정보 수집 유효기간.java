import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        for(var term: terms){
            String[] t = term.split(" ");
            termMap.put(t[0], Integer.parseInt(t[1]));
        }
        String[] td = today.split("\\.");
        int[] tdYmd = new int[]{Integer.parseInt(td[0]), Integer.parseInt(td[1]), Integer.parseInt(td[2])};
        for(int i = 0; i < privacies.length; i++){
            String privacy = privacies[i];
            String[] target = privacy.split(" ");
            String[] ymdS = target[0].split("\\.");
            int[] pYmd = new int[]{Integer.parseInt(ymdS[0]), Integer.parseInt(ymdS[1]), Integer.parseInt(ymdS[2])};
            int duration = termMap.get(target[1]);
            if(compareDate(tdYmd, pYmd, duration))answer.add(i+1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    private boolean compareDate(int[] src, int[] dist, int du){//src 오늘
        dist[1] += du;
        if(dist[1] > 12){
            dist[0] += (dist[1]-1)/12;
            dist[1] =  (dist[1])%12;
            if(dist[1] == 0)dist[1] = 12;
        }
        for(int i = 0; i < 3; i++){
            if(src[i] < dist[i])return false;
            if(src[i] > dist[i]){
                return true;
            }
        }
        return true;
    }
}