import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeak = {"aya","ye","woo","ma"};
        int[] checks = {0,0,0,0};

        for(int i=0; i<babbling.length; i++){
            int current = 0;
            for(int j=0; j<canSpeak.length; j++){
                if(babbling[i].contains(canSpeak[j])){
                    current+=canSpeak[j].length();
                }
            }

            if(babbling[i].length() == current){
                answer += 1;
            }
            current = 0;
        }
        return answer;
    }
}

/*
* 해당 문제 해결법은 옹알이를 하는 4가지 단어가 현재 babbling에 포함되어 있나가 핵심이다.
* 하지만 옹알리가 포함되어 있는것과 별개로 순서가 보장되지 않기 때문에 만약 옹앙리가 포함되면 그 길이를 계속 더하고
* 최종적으로 포함된 길이와 babbling 길이르 비교해 babbling이 옹알이로만 구성된지 확인한다
* */