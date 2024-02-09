import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken()); // 층
			int W = Integer.parseInt(st.nextToken()); // 호
			int N = Integer.parseInt(st.nextToken()); // 순서
			
			int floor = N % H;
			int room = N / H + 1;
			
			if (floor == 0) {
                floor = H;
                room -= 1;
            }
			
			
			int roomNumber = floor * 100 + room;
            bw.write(Integer.toString(roomNumber));
            bw.newLine();
		}
		bw.close();
	}
}