import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] numCount = new int[1000];

        for(int i=0; i<array.length;i++){
            numCount[array[i]] += 1;
        }

        int maxCnt = -1;
        int preMaxCnt = 0;
        for(int j=0; j<1000; j++){
            if(maxCnt <= numCount[j]){
                preMaxCnt = maxCnt;
                maxCnt = numCount[j];
                answer=j;
            }
        }
        if(preMaxCnt == maxCnt)
            return -1;
        return answer;
    }
}