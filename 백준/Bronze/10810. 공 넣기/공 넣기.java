import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		int size = Integer.parseInt(line.split(" ")[0]);
		int th = Integer.parseInt(line.split(" ")[1]);
		
		int[] arr = new int[size];
		Arrays.fill(arr, 0);
		
		for(int i = 0; i < th; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int c = Integer.parseInt(st.nextToken());
			
			for(int j = a; j <= b; j++) {
				arr[j] = c;
			}
		}
		
		IntStream list = Arrays.stream(arr);
		list.asLongStream().forEach(x -> System.out.print(x + " "));
	}
}