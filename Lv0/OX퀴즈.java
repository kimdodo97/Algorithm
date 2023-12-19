import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++){
            String[] quizWord = quiz[i].split(" ");

            int predNum = Integer.parseInt(quizWord[4]);
            int realNum = Cal(quizWord[1],quizWord[0],quizWord[2]);

            if(realNum==predNum){
                answer[i] = "O";
            }
            else{
                answer[i] = "X";
            }
        }

        return answer;
    }

    public static int Cal(String exec, String num1, String num2){
        if(exec.equals("-")){
            return Integer.parseInt(num1) - Integer.parseInt(num2);
        }
        else if(exec.equals("+")){
            return Integer.parseInt(num1) + Integer.parseInt(num2);
        }

        return 0;
    }
}