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
		String p = br.readLine();
		int qt = Integer.parseInt(p.split(" ")[0]);
		int loop = Integer.parseInt(p.split(" ")[1]);
		int[] arr = new int[qt];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

		for(int i = 0; i < loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			int arrA = arr[a];
			int arrB = arr[b];
			
			arr[a] = arrB;
			arr[b] = arrA;
		}
		for(int data : arr) {
			System.out.print(data + " ");
		}
	}
}