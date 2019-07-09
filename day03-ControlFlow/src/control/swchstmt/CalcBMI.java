package control.swchstmt;

import java.util.Scanner;

/**
 * weight
 * height     double
 * 
 * scan입력
 * 
 * scan.nextdouble
 * 
 * BMI=weight/(height^2)
 * @author Administrator
 *
 */
public class CalcBMI {

	public static void main(String[] args) {
		
		//1.선언
		double weight;
		double height;
		double bmi;
		String result;
		Scanner  scan;
		
		//2.초기화
		scan = new Scanner(System.in);
		System.out.println("1.몸무게(kg)와 2.키(m)를 입력하세요.");
		weight = scan.nextDouble();
		height = scan.nextDouble();
		bmi = weight/(height*height);
		//3.사용
		if (bmi > 15) {
			result = "병적인 저체중";
		} else if (bmi >= 15 && bmi < 18.5) {
			result = "저체중";
		} else if (bmi >= 18.5 && bmi < 23) {
			result = "정상";
		} else if (bmi >= 23 && bmi <= 27.5) {
			result = "과체중";
		} else if (bmi > 27.5 && bmi <= 40) {
			result = "비만";
		} else {
			result = "병적인 비만";
		}
		
		System.out.printf("당신의 몸무게는(은) %f, 키는(은) %f이고 체질량 지수는 %f입니다.%n", weight, height, bmi);
		System.out.printf("당신은 %s 입니다.", result);
		
	}

}
