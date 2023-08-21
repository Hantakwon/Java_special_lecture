package Java_lecture;

import java.util.Scanner;

public class SWTest {
    public static void main(String[] args) {
        OddEven oddeven = new OddEven();

        Scanner scanner = new Scanner(System.in);
        System.out.print(" > 숫자를 입력하세요 : ");
        int num = Integer.parseInt(scanner.nextLine());

        oddeven.getNum(num);

        System.out.println("짝수의 합 : " + oddeven.oddEvenSum());
        System.out.println("홀수의 합 : " + oddeven.oddSum());
    }
}

class Odd {
    protected int num;
    private int sum = 0;

    public void getNum(int x) {
        num = x;
    }

    public int oddSum() {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }
}

class OddEven extends Odd {
    private int sum = 0;

    public int oddEvenSum() {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

