import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String input = br.readLine();
			if(isVPS(input))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}
	
	public static boolean isVPS(String input) {
		Stack<Object> stack = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == '('){
				stack.push(ch);
			}
			else if(ch == ')') {
				if(stack.empty()) {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) 
			return true;
		else
			return false;
	}
}
