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
		
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			char temp = input.charAt(i);
			if(temp >= 'a' && temp <= 'z') {
				temp += 13;
				if(temp > 'z') {
					temp -= 26;
				}
				sb.append(temp);
			}
			else if(temp >= 'A' && temp <= 'Z') {
				temp += 13;
				if(temp > 'Z')
					temp -= 26;
				sb.append(temp);
			}
			else sb.append(temp);
			
		}
		System.out.println(sb.toString());
	}
}
