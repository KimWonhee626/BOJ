import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] stack;
	public static int top; // 스택 포인터
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		top = -1;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			
			case "pop":
				System.out.println(pop());
				break;
			
			case "size":
				System.out.println(size());
				break;
			
			case "empty":
				System.out.println(empty());
				break;
				
			case "top":
				System.out.println(top());
				break;
			}
		}
		
	}
	
	public static int empty() {
		if(top == -1) // 비어있을 때
			return 1;
		else 
			return 0;
		
	}

	public static void push(int X) {
		top++;
		stack[top] = X;
	}
	
	// 비어있으면 -1, 아니면 스택 가장 위의 정수 반환
	public static int top() {
		if(empty() == 1)
			return -1;
		else return stack[top];
	}
	
	public static int pop() {
		if(empty() == 1)
			return -1;
		else {
			int result = top();
			top--;
			return result;
		}
	}

	public static int size() {
		return top+1;
	}
}
