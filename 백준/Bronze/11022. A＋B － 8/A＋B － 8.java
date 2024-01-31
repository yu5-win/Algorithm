import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qt = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i < qt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(a);
			arr.add(b);
		}
		
		for(int i = 0; i < arr.size(); i+=2) {
			System.out.println("Case #" + (((i + 1) / 2)+1) + ": " + arr.get(i) + " + " + arr.get(i+1) + " = " + (arr.get(i)+arr.get(i+1)));
		}
	}
}