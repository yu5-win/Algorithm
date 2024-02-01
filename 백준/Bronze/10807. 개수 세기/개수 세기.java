import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> arr = new ArrayList<>();
		
		int qt = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < qt; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int select = Integer.parseInt(br.readLine());
		long cnt = arr.stream().filter(x -> x == select).count();
		
		System.out.print(cnt);
	}
}