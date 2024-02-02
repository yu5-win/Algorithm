import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine();
		
		int a = Integer.parseInt(one.split(" ")[0]);
		int b = Integer.parseInt(one.split(" ")[1]);
		
		List<Integer> arr = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i < a; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		arr.stream().filter(x -> x < b).forEach(y -> System.out.print(y+" "));
	}
}