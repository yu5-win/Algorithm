import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split("");
		
		
		String a = input[0];
		String b = a.equals("F") ? null : input[1];
		
		double answer = 0.0;
		
		if(a.equals("A")) {
			answer += 4;
		} else if(a.equals("B")) {
			answer += 3;
		} else if(a.equals("C")) {
			answer += 2;
		} else if(a.equals("D")) {
			answer += 1;
		}
		
		if(b != null) {
			if(b.equals("+")) {
				answer += 0.3;
			} else if(b.equals("0")) {
				answer += 0.0;
			} else if(b.equals("-")) {
				answer -= 0.3;
			}
		}
		
		System.out.print(answer);
	}
}