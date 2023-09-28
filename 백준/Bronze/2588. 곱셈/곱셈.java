import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aNum = sc.nextInt();
		
		String bStr = sc.next();
		String[] bStrArr = bStr.split("");
		int[] bNumArr = Arrays.stream(bStrArr).mapToInt(Integer::parseInt).toArray();
		
		
		for(int i=bNumArr.length-1; i>=0; i--){
			System.out.println(aNum*bNumArr[i]);
		}
		System.out.println(aNum*Integer.parseInt(bStr));		
	}
}