import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long cnt_2 = count(n,2) - count(n-m,2) - count(m,2);
		long cnt_5 = count(n,5) - count(n-m,5) - count(m,5);
		
		System.out.println(Math.min(cnt_2, cnt_5));
		
		
		
	}
	

	public static long count(long in, long num) {
		long cnt = 0L;
		for(long i = num; i <= in; i *= num) {
			 cnt += (in / i);
		}
		
		return cnt;
	}


}
