import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qt = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= qt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(a+b);
		}
		
		for(int i = 1; i <= arr.size(); i++) {
			System.out.println("Case #" + i + ": " + arr.get(i-1));
		}
	}
}