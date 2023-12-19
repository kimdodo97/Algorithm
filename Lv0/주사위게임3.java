class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dices = {a,b,c,d};
        List<Integer> list = Arrays.asList(dices);

        int count = Collections.frequency(Arrays.asList(dices),a);

//         if(a==b==c==d){
//             return 1111 * a;
//         }

//         if()
//         int test =  checkThree(1,2);
        System.out.println(count);
        return answer;
    }

    public static int  checkThree(int p,int q){
        int result = ((10 * p) + q);
        return (int)Math.pow(result,2);
    }
}