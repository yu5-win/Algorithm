import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
       List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < T; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	arr.add(a+b);
        }
        
        arr.stream().forEach(System.out::println);
	}
}
