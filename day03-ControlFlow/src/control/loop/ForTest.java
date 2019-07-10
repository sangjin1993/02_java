package control.loop;

/**
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 *  (1) continue 없이
 *  (2) continue 있이
 *  
 * 2. 1 ~ 10 까지 제곱표를 출력
 *    1 x  1 =  1 
 *    2 x  2 =  4
 *    .....
 *    10 x 10 = 100
 * 
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
		
							//관계연산자 조심!!!!
		for(int num = 50; num >= 0; num--) {
			
			if(num % 2 == 0) {
				System.out.printf("%d%n", num);
			}
			
		}
		// continue사용
		for (int num = 50; num >= 0; num--) {

			if (num % 2 == 1) {
				continue;
			}
			System.out.printf("%d%n", num);

		}
		
		
		
	}

}
