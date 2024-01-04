import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arrs = s.toCharArray();
        Stack<Character> st = new Stack();

        for(int i=0; i<arrs.length; i++){
            if(arrs[i] == '('){
                st.push(arrs[i]);
            }
            else if(arrs[i] == ')'){
                if(st.empty()){
                    return false;
                }

                st.pop();
            }
        }

        if(!st.empty()){
            return false;
        }
        return answer;
    }
}