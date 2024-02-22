import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[8];
		
		for(int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean ascending = true;
		boolean descending = true;
		
		for(int i = 0; i < 7; i++) {
			if(arr[i+1] > arr[i]) {
				descending = false;
			} 
			if(arr[i+1] < arr[i]) {
				ascending  = false;
			}
		}
		
		if(ascending) {
			System.out.print("ascending");
		} else if(descending) {
			System.out.print("descending");
		} else {
			System.out.print("mixed");
		}
	}
}