package D3;

import java.util.Scanner;

class Calculate {
	int sum;
	
	public int plus(int x, int y) {
		sum = x+y;
		return sum;
	}
}
public class Ex3_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Calculate calculate = new Calculate();
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = s.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = s.nextInt();
		
		System.out.printf("%d + %d = %d",num1,num2,calculate.plus(num1,num2));
	
	}

}
