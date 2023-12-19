import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int centerNum = total/num;

        int left = (num-1)/2;
        int right = (num-1-left);

        int startNum = centerNum-left;
        int endNum = centerNum+right;

        int j=0;
        for(int i=startNum; i<endNum+1; i++){
            answer[j] = i;
            j++;
        }
        return answer;
    }
}