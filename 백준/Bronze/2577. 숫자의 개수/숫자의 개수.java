import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int r = A * B * C;
		String[] strR = Integer.toString(r).split("");
		
		int[] result = new int[10]; 
		Arrays.setAll(result, x -> 0);
		
		for(int i = 0; i < strR.length; i++) {
			switch(strR[i]) {
				case "0":
				result[0]++;
				break;
				case "1":
					result[1] += 1;
					break;
				case "2":
					result[2] += 1;
					break;
				case "3":
					result[3] += 1;
					break;
				case "4":
					result[4] += 1;
					break;
				case "5":
					result[5] += 1;
					break;
				case "6":
					result[6] += 1;
					break;
				case "7":
					result[7] += 1;
					break;
				case "8":
					result[8] += 1;
					break;
				case "9":
					result[9] += 1;
					break;
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(result[i]);			
		}
	}
}