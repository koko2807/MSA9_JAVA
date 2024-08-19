package Day07.Review;

import java.util.Scanner;

/**
 * 더조은컴퓨터아카데이에서 김조은 팀장에게 예산을 주고
 * 에어컨을 구매하라고 지시하였다.
 * 이때 에어컨 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비			: 657825
 * 50000		: 13개
 * 10000		: 0개
 * 5000			: 1개
 * 1000			: 2개
 * 500			: 1개
 * 100			: 3개
 * 50			: 0개
 * 10			: 2개
 * 5			: 1개
 * 1			: 0개
 * 위와같이 입력하면,
 * 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */
public class Ex03_화폐매수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매비 : ");
		int a = sc.nextInt();
		int count = a / 50000;
		
		count = a / 50000; 
		a=a%50000;
		System.out.println("50000 : " + count);
		count = a / 10000;
		a=a%10000;
		System.out.println("10000 : " + count);
		count = a / 5000;
		a=a%5000;
		System.out.println("5000 : " + count);
		count = a / 1000;
		a=a%1000;
		System.out.println("1000 : " + count);
		count = a / 500;
		a=a%500;
		System.out.println("500 : " + count);
		count = a / 100;
		a=a%100;
		System.out.println("100 : " + count);
		count = a / 50;
		a=a%50;
		System.out.println("50 : " + count);
		count = a / 10;
		a=a%10;
		System.out.println("10 : " + count);
		count = a / 5;
		a=a%5;
		System.out.println("5 : " + count);
		count = a / 1;
		a=a%1;
		System.out.println("1 : " + count);
		
		sc.close();
	}
}
