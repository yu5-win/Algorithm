import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qt = sc.nextInt();
		
		for(int j = 1; j <= qt; j++) {
			for(int i = qt; i > j; i--) {
				System.out.print(" ");
			}
			for(int z = 1; z <= j; z++) {
				System.out.print("*");			
			}
			System.out.println();
		}
	}
}