package D3;

import java.util.Scanner;

class Circle {
	static double pi;
	
	public Circle() {
		pi = Math.PI;
	}
}

public class Ex3_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Circle circle = new Circle();
		
		System.out.print("원의 반지름 입력 : ");
		int radius = s.nextInt();
		
		System.out.printf("원의 넓이 : %.2f\n",(radius*radius*Circle.pi));
	}

}
