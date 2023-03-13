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
		
		StringBuilder result = new StringBuilder();
		boolean[] isPrime = new boolean[1000001]; // 소수 여부 판별
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		// 초기화
		for(int i = 2; i <1000001; i++) {
			isPrime[i] = true;
			
		}
		
		for (int i = 2; i <= (int) Math.sqrt(1000000); i++) { 
			for (int j = 2; i * j < 1000001; j++) {
				isPrime[i * j] = false;
			}
		}
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			boolean flag = false;
			for (int i = 2; i <= n / 2; i++) {
				if (isPrime[i] && isPrime[n - i]) {
					System.out.println(n + " = " + i + " + " + (n - i));
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
			
		}
		
	}

}
