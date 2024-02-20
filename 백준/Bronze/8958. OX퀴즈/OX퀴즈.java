import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int qt = Integer.parseInt(br.readLine());
		
		int answer = 0;
		
		for(int i = 0; i < qt; i++) {
			String[] arr = br.readLine().split("");
			int cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].equals("O")) {
					cnt++;
				} else if(arr[j].equals("X")) {
					cnt = 0;
				}
				answer += cnt;
			}
			sb.append(answer + "\n");
			answer = 0;
		}
		System.out.println(sb);
	}
}