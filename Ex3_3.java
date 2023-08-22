package D3;

import java.util.Scanner;

class Calculator {
	
	public int[] plus(int x, int y) {
		int sum[] = new int[3];
		
		for(int i=x+1; i<y; i++) {
			sum[0] += i;
			if(i%2 != 0) {
				sum[1] += i; 
			}
			else {
				sum[2] += i;
			}
		}
		return sum;
	}	
}

public class Ex3_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Calculator calculator = new Calculator();
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = s.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = s.nextInt();
		
		int max = num1;
		int min = num1;
		
		if(num1<num2) max=num2;
		else min = num2;
		
		int array[] = calculator.plus(min,max);
		
		System.out.println("두 수 사이의 합계 : " + array[0]);
		System.out.println("두 수 사이의 홀수의 합계 : " + array[1]);
		System.out.println("두 수 사이의 짝수의 합계 : " + array[2]);
	}

}
