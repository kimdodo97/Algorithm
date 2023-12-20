class Solution {
    public int solution(int[] common) {
        int[] check = {0,0};
        int answer = 0;
        int n = common.length;
        int num = 0;
        if(common[0] == 0){
            return (common[1]-common[0]) + common[n-1];
        }

        if ((common[2]-common[1]) == (common[1]-common[0])){
            return common[n-1] + (common[2]-common[1]) ;
        }

        if ((common[2]/common[1]) == (common[1]/common[0])){
            return common[n-1] * (common[2]/common[1]) ;
        }

        return answer;
    }
}
//엣지 케이스를 고려하면 쉬운 문제