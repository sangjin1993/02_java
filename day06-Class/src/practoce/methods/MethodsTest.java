package practoce.methods;

public class MethodsTest {

	public static void main(String[] args) {
		
		//1.메소드 정의 클래스 VarietyMethods 의
		// 변수 선언
		VarietyMethods methods;
		
		//2. 초기화
		methods = new VarietyMethods();
		
		//3. 사용
		methods.sayHello();
		methods.maxims("홍길동", "호부호형을 못하니...");
		methods.maxims("소크라테스", "Know Yourself");
		methods.maxims("피터사간", "모든 사람은 두 종류의 고통중에서 선택해야 한다. 훈련하는 고통이나 후회하는 고통이다.");
		
		
		double cel = methods.fahToCel(100.0);
		System.out.println("cel=" + cel);
		
		//1.
		methods.birthYearMonth("김상진", 1993, 10);
		
		//2.
		methods.printNineNineTable(9);
		
		//3.
		
		
		//4.
		methods.calcBmi(1.8, 72);
		
		//5.
		methods.min(20,10);
		
		//6.
		methods.max(30, 40);
		
		//7.
		int[] array = {50, 70, 80, 90};
		int sumOfArray = methods.sumOfArray(array);
		System.out.printf("sumOfArray=%d%n", sumOfArray);
		
		//8. avgOfArray 배열의 평균을 계산하는 메소드 테스트
		//1) 매개변수로 넘길 배열 생성
		int[] ages = {12, 15, 10, 18, 17};
		//2) 테스트할 메소드 call 하며 1의 배열을 전달
		double avgOfArray = methods.avgOfArray(ages);
		//3) 평균이 저장된 변수를 출력
		System.out.printf("avgOfArray=%3.1f%n", avgOfArray);
		
		//9.
		methods.adder('+', 10, 20);
		
		//
		methods.isEven(10);
		
		methods.printTenTimes(1);
		
		
	}

}
