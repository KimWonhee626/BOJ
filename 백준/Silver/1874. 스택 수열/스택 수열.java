import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder(); // 출력해야하는 결과물 저장
		
		boolean flag = true; // 수열 만들수 있는지 여부
		
		int temp = 1; // push해야하는 정수를 저장
		int value; // 입력받은 수열값 저장
		
		for(int i=0; i<n; i++) {
			value = Integer.parseInt(br.readLine());
			
			for(int j=temp; j<=value; j++,temp++) {
				stack.push(j);
				sb.append("+\n");
			}
			
			if(value != stack.peek()) {
				flag = false;
			}
			else {
				stack.pop();
				sb.append("-\n");
			}
		}
		if(flag) {
		System.out.println(sb);
		}
		else {
			System.out.println("NO");
		}
	}
	

	
}
