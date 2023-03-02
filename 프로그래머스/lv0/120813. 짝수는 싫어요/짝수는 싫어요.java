class Solution {
    public int[] solution(int n) {
        int answer[];
        if(n % 2 == 1)
            answer = new int[n / 2 + 1];
        else
            answer = new int[n / 2];
        
        for(int i=1, idx=0; i <= n; i++){
            if(i % 2 == 1){
                answer[idx++] = i;
            }
        }
        
        return answer;
    }
}