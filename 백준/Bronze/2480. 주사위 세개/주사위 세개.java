import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        
        int answer = 0;
        int[] b = {one, two, three};
        
        int cnt = 0;
        int a = 0;
        
        if(one == two) {
        	cnt++;
        	a = one;
        }
        if(one == three) {
        	cnt++;
        	a = one;
        }
        if(two == three) {
        	cnt++;
        	a = two;
        }
        
        
        if(cnt == 3) {
        	answer = 10000 + a * 1000;
        } else if(cnt == 1) {
        	answer = 1000 + a * 100;
        } else if(cnt == 0) {
        	answer = Arrays.stream(b).max().getAsInt() * 100;
        }
        
        System.out.print(answer);
	}
}
