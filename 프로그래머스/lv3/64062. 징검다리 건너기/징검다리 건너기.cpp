#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(vector<int> stones, int k) {
    int answer = 0, right = 0;
    for(auto& s:stones){
        if(s > right)right = s;
    }
    while(answer < right){
        int mid = (answer+ right)/2;
        int cnt = 0;
        for(auto& s:stones){
            if(s > mid)cnt = 0;
            else cnt++;
            if(cnt >= k)break;
        }
        if(cnt < k){
            answer = mid + 1;
        }
        else right = mid;

    }
    return answer;
}