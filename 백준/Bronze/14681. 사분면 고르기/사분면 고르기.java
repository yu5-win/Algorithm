import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int answer = 0;
        
        if(a > 0) { // 양수
        	if(b > 0) { // 양수
        		answer = 1;
        	} else if(b < 0) { // 음수
        		answer = 4;
        	}
        } else if(a < 0) { // 음수
        	if(b > 0) { // 양수
        		answer = 2;
        	} else if(b < 0) { // 음수
        		answer = 3;
        	}
        }
        System.out.print(answer);
	}

}
