package Java_lecture;

import java.util.Scanner;

class Choice{ // 음료 선택 클래스
	Scanner s = new Scanner(System.in);

	Cola cola = new Cola();
	Cidar cidar = new Cidar();
	
	public int choice;
	
	public void choice(){ // 음료 선택 메소드
		System.out.print("구입할 음료를 선택해주세요,[콜라(1),사이다(2)] : ");
		choice = s.nextInt();
		if(choice == 1) { // 콜라 선택
			cola.guide(); // 콜라 가격 안내
			cidar.buy(choice); // 구매 메소드
		}
		else if(choice == 2) { // 사이다 선택
			cidar.guide(); // 사이다 가격 안내
			cidar.buy(choice); // 구매 메소드
		}
	}
}

class Calculate{ // 계산 클래스
	public int money;
	public int price;
	public int sum;
	
	public int calculate(int money, int price) { // 계산 후 반환 매소드
		this.money = money;
		this.price = price;
		sum = this.money - this.price;
		return sum; // 거스름돈 반환
	}
}

class Cola{
	String cola = "콜라";
	int price = 1200;
	
	Scanner s = new Scanner(System.in);
	
	Calculate calculate = new Calculate();
	
	public int money;

	public void guide() { // 가격 안내 메소드
		System.out.println("1200원입니다.");
	}
}

class Cidar extends Cola{
	String cidar = "사이다";
	int price = 1000;
	public String request;
	public int choice2 ;
	
	Request quest = new Request();
	
	public void guide() { // 가격 안내 메소드 오버라이딩
		System.out.println("1000원입니다.");
	}
	
	public void buy(int choice) {
		System.out.print("돈을 투입하여주세요 : ");
		money = s.nextInt();
		
		if(choice == 1) {
			if(calculate.calculate(money,super.price) >= 0) { // 금액 확인
				System.out.println("거스름돈 : " + calculate.calculate(money,super.price));		
				System.out.print("추가요청 사항이 있으신가요? [예(1),아니요(2)] : ");
				choice2 = s.nextInt();
				if(choice2 == 1) { // 요청사항이 있을 경우
					System.out.print("요청사항을 입력하여 주세요 : ");
					request = s.next();
					quest.request(request);
					quest.request();
				}
				else if(choice2 == 2) { // 요청사항이 없을 경우
					quest.request();
				}
			}
			else 
				System.out.print("돈이 부족합니다.");
		}
		
		else if (choice == 2) {
			if(calculate.calculate(money,price) >- 0) {
				System.out.println("거스름돈 : " + calculate.calculate(money,price));
				System.out.print("추가요청 사항이 있으신가요? [예(1),아니요(2)] : ");
				choice2 = s.nextInt();
				if(choice2 == 1) {
					System.out.print("요청사항을 입력하여 주세요 : ");
					request = s.next();
					quest.request(request);
					quest.request();
				}
				else if(choice2 == 2) {
					quest.request();
				}
			}
			else 
				System.out.print("돈이 부족합니다.");
		}
	}
}

class Request {
	public void request() { // 메소드 생성
		Finish finish = new Finish();
	}
	public void request(String x) { // 메소드 오버로딩
		Finish finish = new Finish(x);
	}
}
class Finish{ // 마지막 멘트 클래스
	public Finish() { // 생성자
		System.out.print("감사합니다.");
	}
	
	public Finish(String request) { // 생성자 오버로딩
		System.out.println("추가요청 사항 : " + request);
	}
}

public class Vending_machine {
	public static void main(String[] args) {
		Choice choice = new Choice();
		choice.choice();
	}
}
