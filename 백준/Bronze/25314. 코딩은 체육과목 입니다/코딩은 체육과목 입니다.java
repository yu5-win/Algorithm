import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int a = sc.nextInt()/4;
		String answer = "";
		for(int i = 0; i < a; i++) {
			answer += "long ";
		}
		
		System.out.print(answer + "int");
	}
}
