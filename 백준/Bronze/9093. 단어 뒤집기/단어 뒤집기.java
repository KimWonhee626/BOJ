import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			
			StringBuilder reverse = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				reverse.append(new StringBuilder(st.nextToken()).reverse().toString());
				reverse.append(" ");
			}
				
			System.out.println(reverse);
			
		}
		
	}
}
