import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] Arr = s.split(" ");
        Stack<Integer> stackInt = new Stack<>();
        for(int i=0; i<Arr.length; i++){
            //System.out.println(i);
            if(Arr[i].equals("Z")){
                stackInt.pop();
            }
            else{
                stackInt.push(Integer.parseInt(Arr[i]));
            }
        }
    
        for (int element : stackInt) {
            //System.out.println(element);
            answer += element;
        }
        return answer;
    }
}
