import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int price = sc.nextInt();
        int qt = sc.nextInt();
		
        int sum = 0;
        
        String answer = "";
        
		for(int i = 0; i < qt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a*b;
		}
		answer = price == sum ? "Yes" : "No";
		
		System.out.print(answer);
	}
}
