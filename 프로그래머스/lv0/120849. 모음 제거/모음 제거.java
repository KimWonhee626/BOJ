class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = "aeiou";
        for(char c : s.toCharArray()){
            my_string = my_string.replace(String.valueOf(c), "");
        }
    
        return my_string;
    }
}