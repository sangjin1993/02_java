package control.loop;
/**
 * 1 ~ 100 사이의 홀수의 합을 구하는 클래스
 * for loop, continue 를 활용하여 테스트한다.
 * ------------------------------------
 * continue : 현재 이하 문장 무시(실행 x)
 * 			   다음 반복 실행
 * 
 * @author Administrator
 *
 */
public class ContinueTest {

	public static void main(String[] args) {
//		//1.선언, 초기화
//		int sum = 0;
//		
//		//3. 사용
//		for(int idx = 1; idx <= 100; idx++) {
//			if(idx % 2 ==0) {
//				continue;
//			}
//			sum += idx;
//	}
//			System.out.printf("1 ~ 100 사이 홀수의 합 : %d%n", sum);
//			
//			// continue ==> if ~ else 변결하면
//			sum = 0;
//			for (int idx = 1; idx <= 100; idx++) {
//				if(idx % 2)
//			} else {
//				sum += idx;
//			}
//			System.out.printf("1 ~ 100 사이 홀수의 합 : %d%n", sum);
//			
//			
//			//문제 : 1 ~ 100 사이의 3의 배수의 합을 구하시오
//			//		continue 를 사용하여
			
			int sum = 0;
			
			for (int idx = 1; idx <=100; idx++) {
				if(idx % 3 != 0) {
					continue;
				}
				sum += idx;
			}
			
			System.out.printf("1 ~ 100 사이 3의 배수의 합 : %d%n", sum);
			
			
			
			
	}
}
