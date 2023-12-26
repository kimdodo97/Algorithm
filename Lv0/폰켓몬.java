import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = (nums.length);
        int Half = N/2;
        HashSet<Integer> uniqueNum = new HashSet<Integer>();
        for(int i=0; i<N; i++){
            uniqueNum.add(nums[i]);
        }

        answer = (uniqueNum.size() > Half) ? Half : uniqueNum.size();
        return answer;
    }
}