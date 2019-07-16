package control.loop;

public class SumOfEvens {

	public static void main(String[] args) {
		int num = 0;
		int sum = 2;
		
		while(num <= 100) {
			System.out.printf("%d = %d%n", num, num);
			sum += num;
			num += 2;
		}
		System.out.printf("0부터 100사이 짝수의 합은 %d입니다.", sum);
	}

}
