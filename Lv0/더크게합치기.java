class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = "" + a + b;
        String ba = "" + b + a;
        int result1 = Integer.valueOf(ab);
        int result2 = Integer.valueOf(ba);
        answer = (result1>=result2) ? result1 : result2;
        return answer;
    }
}