import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j<i; j++ ){
                result.append("*");
            }
            result.append("\n");
        }
            
        System.out.println(result.toString());
    }
}