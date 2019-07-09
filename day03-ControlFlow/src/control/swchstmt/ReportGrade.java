package control.swchstmt;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		//1.선언
		int input;
		char grade;
		Scanner scan;
		
		//초기화
		scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		input = scan.nextInt();
		
		//사용
		switch (input / 10) {
		case 10 : case 9 :
			grade ='A';
			break;
		
		case 8 :
			grade ='B';
			break;
		
		case 7: case 6 :
			grade ='C';
			break;
			
		case 5: case 4 :
			grade ='D';
			break;
			
			default :
				grade ='F';
		}
		System.out.printf("입력 값 %d의 등급은 %s입니다.%n", input, grade);

		
	}

}
