import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] data =new int[N];
		for(int i=0; i<N; i++){
            data[i] = Integer.parseInt(st.nextToken());
        }
		
		int[] result = new int[N];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<N; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			
			while(!stack.isEmpty() && data[stack.peek()] < data[i]) {
				result[stack.pop()] = data[i];
			}
			stack.push(i);
			
		}
		while(!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
		
		for(int i=0; i<N; i++) {
			bw.write(result[i] + " ");
		}
		bw.write("\n");
		bw.flush();
		
		
	}
}
