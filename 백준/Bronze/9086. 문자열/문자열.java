import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int qt = Integer.parseInt(br.readLine());
		
		List<String> answer = new ArrayList<>();
		for(int i = 0; i < qt; i++) {
			String str = br.readLine();
			
			answer.add(str.charAt(0) + "" + str.charAt(str.length()-1));
		}
		answer.stream().forEach(x -> System.out.println(x));
	}
}