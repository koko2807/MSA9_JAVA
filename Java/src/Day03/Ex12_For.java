package Day03;

import java.util.Iterator;

public class Ex12_For {

	public static void main(String[] args) {
		// for( 1초기식 ; 2조건식 ; 증감식 ) { 3실행문 }
		// - 실행 순서 : 1 -> 반복(2 -> 3 -> 4)
		
		// 1. 1~10까지 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2. 50~100 까지 정수를 출력하시오.
		for (int i = 50; i <= 100; i++) {
			System.out.println(i + " ");
			// 10개씩 개행(엔터)하여 출력
			if( (i+1) % 10 == 0 )
				System.out.println();
		}
		System.out.println();
		
		// 3. 1~20 까지 정수 중 짝수만 출력하시오.
		for (int j = 1; j <= 20 ; j+=2) {
			System.out.print(j + " ");
		}
		
		
		// 4. 1~20 까지의 정수 중 홀수만 출력하시오.
			
		}
		}
	
