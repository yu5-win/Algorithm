import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int qt = 9;
		int num = Integer.MIN_VALUE;
		int idx = -1;
		
		List<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= qt; i++) {
			int a = Integer.parseInt(br.readLine());
			arr.add(a);
		}
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) > num) {
				num = arr.get(i);
				idx = i + 1;
			}
		}
		
		System.out.println(num);
		System.out.println(idx);
	}
}