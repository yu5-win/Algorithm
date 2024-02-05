import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		
		for(int i = 0; i < a.length(); i++) {
			if(Character.isUpperCase(a.charAt(i))) {
				System.out.print(Character.toLowerCase(a.charAt(i)));
			} else if(Character.isLowerCase(a.charAt(i))) {
				System.out.print(Character.toUpperCase(a.charAt(i)));
			}
		}
	}
}