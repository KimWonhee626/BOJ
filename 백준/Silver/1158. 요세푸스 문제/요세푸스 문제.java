import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		StringBuilder result = new StringBuilder(); // 제거되는 번호 저장
		result.append("<");
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		while(queue.size() > 1) {
			for(int i=0; i<K-1; i++) {
				int skip = queue.poll();
				queue.add(skip);
			}
			result.append(queue.poll()).append(", ");
		}
		
		result.append(queue.poll()).append(">");
		
		System.out.println(result);
	}
}
