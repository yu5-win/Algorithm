import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        
        int a = m + time;
        int hh = a / 60;
        int mm = a % 60;
        
        int aH = h+hh;
        int aM = mm;
        
        if(aH >= 24) {
        	aH = aH - 24;
        }
        
        System.out.print(aH + " " + aM);
	}
}
