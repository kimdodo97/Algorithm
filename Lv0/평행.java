class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double first = incline(dots[0],dots[1]);
        double second = incline(dots[2],dots[3]);

        
        if ((first == second) && (first != 0 || second != 0)){
            return 1;
        }
        
        first = incline(dots[0],dots[2]);
        second = incline(dots[1],dots[3]);
        
        if ((first == second) && (first != 0 || second != 0)){
            return 1;
        }
        
        first = incline(dots[0],dots[3]);
        second = incline(dots[1],dots[2]);
        
        if ((first == second) && (first != 0 || second != 0)){
            return 1;
        }
            
        return answer;
    }
    
    public static double incline(int[] firstPoint, int[] secondPoint){
        return (double) (secondPoint[1] - firstPoint[1]) / (secondPoint[0] - firstPoint[0]);
    }
}
