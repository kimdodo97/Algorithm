import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = -1;
        Arrays.sort(citations);
        int max = citations[citations.length-1];
        for(int i=0; i<max+1; i++){
            int cnt = 0;
            for(int j=0; j<citations.length; j++){
                if(citations[j] >= i)
                    cnt++;
            }
            if(cnt>=i){
                answer = i;
            }
        }
        return answer;
    }
}