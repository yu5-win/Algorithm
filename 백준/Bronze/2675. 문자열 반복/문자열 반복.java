import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] answer = new String[T];
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			String[] arrS = S.split("");
			
			String answerStr = "";
			for(int j = 0; j < arrS.length; j++) {
				for(int z = 0; z < R; z++) {
					answerStr += arrS[j];
				}
			}
			answer[i] = answerStr;
		}
		
		
		for(int i = 0; i < T; i++) {
			System.out.println(answer[i]);			
		}
	}
}