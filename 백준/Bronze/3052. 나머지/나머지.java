import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> list = new HashSet<>();
		
		for(int i = 0; i < 10; i ++) {
			list.add(Integer.parseInt(br.readLine()) % 42);
		}
		System.out.println(list.size());
	}
}