class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i < babbling.length; i++){
            babbling[i] = babbling[i].replaceFirst("aya", "0");
            babbling[i] = babbling[i].replaceFirst("woo", "0");
            babbling[i] = babbling[i].replaceFirst("ye", "0");
            babbling[i] = babbling[i].replaceFirst("ma", "0");
            babbling[i] = babbling[i].replace("0", ""); // 문자열에 남아있는 문자가 없으면 ""로 바뀜
            
            if(babbling[i].equals(""))
                answer++;
        }
        return answer;
    }
}