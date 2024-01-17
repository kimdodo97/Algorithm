import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int prefix = 0;
        Arrays.sort(phone_book);
        System.out.println(Arrays.toString(phone_book));
        for(int i =0; i<phone_book.length; i++){
            String current = phone_book[i];
            int phoneLength = current.length();

            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[j].startsWith(current)){
                    return false;
                }
            }
        }
        return answer;
    }
}