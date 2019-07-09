package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문 사용하여 다음의 기준으로
 * 학점을 계산하는 클래스
 * ----------------------------
 * A : 90점 이상
 * B : 80 ~ 89점 사이
 * C : 60 ~ 79점 사이
 * D : 40 ~ 59점 사이
 * F : 이하 나머지
 * ----------------------------
 * printf 로 출력
 * @author Administrator
 *
 */
public class Grade {

	public static void main(String[] args) {
		
		//1.선언
		int input;
		char result;
		Scanner scan;
		
		// 2.초기화
		scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		input = scan.nextInt();
		
		// 3.사용
		if (input >=90) {
			result = 'A';
		} else if (input >= 80 && input < 90) {
			result = 'B';
		} else if (input >= 60 && input < 80) {
			result = 'C';
		} else if (input >= 40 && input < 60) {
			result = 'D';
		} else {
			result = 'F';
		}
		
		
		
		System.out.printf("등급은 %c 입니다.%n", result);
		
		
		
		
		
	}

}
