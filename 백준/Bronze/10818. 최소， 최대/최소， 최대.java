import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int qt = Integer.parseInt(br.readLine());
		
		List<Integer> arr = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < qt; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int max = Collections.max(arr);
		int min = Collections.min(arr);
		
		System.out.print(min + " " + max);
	}
}