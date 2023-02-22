import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str =  br.readLine();
		int M = Integer.parseInt(br.readLine()); // 명령어 개수
		
		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		
		
		for(int i=0; i<str.length(); i++) { // 입력받은 문자열을 left에 한문자씩 저장
			left.push(str.substring(i, i+1));
		}
		
		
		for(int i=0; i<M; i++) {
			String cmd = br.readLine();
			char c = cmd.charAt(0);
			
			switch(c) {
			case 'L':
				if(!left.isEmpty()) { // left가 비어있지 않은경우
					right.push(left.pop());
				}
				break;
			case 'D': 
				if(!right.isEmpty()) { // right가 비어있지 않은경우
					left.push(right.pop());
				}
				break;
			
			case 'B':
				if(!left.isEmpty()) {
					left.pop();
				}
				break;
			case 'P':
				char plus = cmd.charAt(2);
				left.push(String.valueOf(plus));
				break;
			default:
				break;
			}
			
		}
		
		while(!left.isEmpty()) //오른쪽 스택에 합침
            right.push(left.pop());

        while(!right.isEmpty())
        	bw.write(right.pop());
        
        bw.flush();
        bw.close();
    
		
	}
}
