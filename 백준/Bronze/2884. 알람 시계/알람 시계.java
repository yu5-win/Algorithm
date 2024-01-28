import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        int aH = 0;
        int aM = 0;
        
        int calM = m - 45;
        
        if(calM < 0) { // 시간 -1. ex)15 40 -> 14 55
        	aH = h - 1;
        	aM = 60 + calM; 
        } else if(calM >= 0) {
        	aH = h;
        	aM = calM;
        }
        
        if(aH < 0) {
        	aH = 24 + aH;
        }
        
        System.out.print(aH + " " + aM);
	}
}
