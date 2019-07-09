package control.loop;

public class SumOfOdds {

	public static void main(String[] args) {
		//1.선언, 2.초기화
		int num = 1;
		int sum = 0;
		
		//3.사용
		while (num <= 100) {
			if(num % 2 == 1) {
				sum +=num;
			}
			num++;
			//num += 2;    num++;
		}
		System.out.printf("1부터 100사이 홀수의 합은 %d입니다. %n", sum);
	}

}
