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
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		System.out.println(gdc(n,m));
		System.out.println(lcm(n,m));
		
		
	}
	public static int gdc(int n, int m) {
		if(m == 0) return n;
		return gdc(m, n % m);
	}
	
	public static int lcm(int n, int m){
		return n * m / gdc(n, m);
	}
	
	
}
