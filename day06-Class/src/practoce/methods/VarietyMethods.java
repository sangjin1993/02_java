package practoce.methods;
/**
 * 
 * @author Administrator
 *
 */
public class VarietyMethods {
	
	
	/**
	 * 화면에 hello, world! 를 출력하는 메소드
	 * sayHello 를 작성하시오.
	 */
	public void sayHello() {
		System.out.println("hello, world!");
	}
	
	/**
	 * 매개변수
	 * 유명인(명사)의 이름을 입력(name) 받고
	 * 그 사람이 한 유명한 문구(maxim)를 입력받아
	 * 
	 * 000(이)가 말하길 "....." 라고 하였다.
	 * 
	 * 라는 문장을 출력하는 메소드
	 * maxims를 정의하여라.
	 * 
	 * @
	 */
	public void maxims(String name, String maxim) {
		System.out.printf("%s(이)가 말하길 \"%s\"라고 하였다.\n", name, maxim);
	}
	/**
	 * 입력된 화씨온도를 섭씨온도로 변환하여
	 * 변환된 섭씨온도를 리턴하는 메소드
	 * fahToCel 을 정의하여라.
	 * 
	 * 변환공식 : 5 / 9 * (F - 32)
	 * 
	 * @param fah : double 변환할 화씨 온도 값
	 * @return 변환된 섭씨 온도 값
	 */
	
	public double fahToCel(double fah) {
		return 5.0 / 9.0 * (fah - 32);
	}
	
	// =======================================
	/**
	 * 1.어떤 사람의 이름, 생년, 출생월을 매개변수로 받아
	 * 
	 * 000는 문장으로 출력하는
	 * birthYearMonth 라는 메소드를 정의하시오.
	 * @param name : String
	 * @param year : int
	 * @param month : int
	 */
	public void birthYearMonth (String name, int year, int month) {
		System.out.printf("%s의 태어난 날은 %d년 %d월 입니다.%n", name, year, month);
	}
		
		
	
	
	/**
	 * 2.출력할 단의 숫자를 입력받아
	 * 해당 단의 구구단을 출력하는 메소드
	 * 
	 * 출력의 첫 줄에 x단 이라는 제목을 출력
	 * 
	 * printNineNineTable 을 디자인
	 * @param stage : int
	 */
	public void printNineNineTable(int stage) {
		System.out.printf("%d 단%n", stage);
		for(int idx = 1; idx <=9; idx++) {
			System.out.printf("%d x %d = %d%n", stage, idx, (stage * idx));
		
		
		}
	}
	
	
	/**
	 * 3.
	 * 출력할 단의 숫자를 가지고 있는 int 배열을
	 * 매개변수로 입력받아 
	 * 입력된 배열의 원소인 각 숫자에 대해
	 * 구구단을 출력하는 메소드
	 * printNineNineTableArray를 정의하시오.
	 * @param stages : int[] 배열
	 */
	public void printNineNineTableArray(int[] stages) {
		
	}
	
	
	/**
	 * 4.
	 * 키(cm), 몸무게(kg)을 매개 변수로 입력받아
	 * BIM 지수를 계산하여 비만도 판정 결과를 리턴하는 메소드
	 * calcBmi 를 정의하시오.
	 * 
	 * 공식 : 몸무게(kg) / 키(m)의 제곱
	 * 
	 * 15.0미만			병적인 저체중
	 * 15.0이상 18.5미만	저체중
	 * 18.5이상 23.0미만	정상
	 * 23.0이상 27.5이하	과체중
	 * 27.5초과 40.0이하	비만
	 * 40초과				병적인 비만
	 * @param height : double
	 * @param weight : double
	 * @return String 비만도 판정 문자열
	 */
	public String calcBmi(double height, double weight) {
		double bmi;
		String result;
		bmi = weight / (height * height);
		
		
		if (bmi > 40) {
			result = "병적인 비만";
		} else if (bmi >= 40) {
			result = "비만";
		} else if (bmi >= 27.5) {
			result = "과체중";
		} else if (bmi > 23) {
			result = "정상";
		} else if (bmi > 15) {
			result = "저체중";
		} else {
			result = "병적인 저체중";
		}
		System.out.printf("당신의 키는%f, 몸무게는 %f 입니다%n", height, weight);
		System.out.printf("당신은 %s 입니다.%n", result);
		return result;
	}
	
	
	/**
	 * 5.
	 * 입력된 두 정수 중에서 작은 수를 찾아 리턴하는 메소드
	 * min을 정의하시오
	 * 
	 * @param input1 : int
	 * @param input2 : int
	 * @return int 입력된 두 값 중 작은 정수
	 */
	public int min(int input1, int input2) {
		int min =0;
		if(input1 > input2) {
			min = input2;
		} else {
			min = input1;
		}
		System.out.printf("최소값은 %d 입니다.%n", min);
		return min;
	}
	
	
	/**
	 * 입력된 두 정수 중에서 큰 수를 찾아 리턴하는 메소드
	 * max를 정의하시오
	 * 
	 * @param input1 : int
	 * @param input2 : int
	 * @return int 입력된 두 값 중 큰 정수
	 */
	
	public int max(int input1, int input2) {
		int max = 0;
		if(input1 > input2) {
			max = input1;
		} else {
			max = input2;
		}
		System.out.printf("최대값은 %d입니다.%n", max);
		return max;
	}
	
	/**
	 * 7.
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드
	 * sumOfArray를 정의하시오
	 * 
	 * @param number : int[] (int 배열)
	 * @return int 배열의 각 원소의 합
	 */
	
	public int sumOfArray(int[] number) {
		int sum = 0;
		
		for(int num : number) {
			sum += num;
		}
		return sum;
	}
	
	/**
	 * 8.
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소의 평균을 구하여 리턴하는 메소드
	 * avgOfArray를 정의하시오
	 * 
	 * @param numbers : int[] (int 배열)
	 * @return double 배열의 각 원소의 평균
	 */
	
	public double avgOfArray(int[] numbers) {
		// 1.배열 원소의 총합
		// (1) 변수 선언, 초기화
		int sum = 0;
		double average;
		// (2) 배열의 원소의 합을 구함 == for each
		for(int num : numbers) {
			sum +=num;
		}
		// 2. 총합 / 원소의 갯수 ==> 평균
		average = (double)sum / numbers.length;
		
		// 3. 평균을 리턴
		return average;
	}
	
	/**
	 * 9.
	 * char 타입의 연산자와 두 개의 정수를 매개변수로 입력받아
	 * 
	 * 입력된 연산자가 '+'일 때만
	 * 두 정수의 합을 구하여 출력하는 메소드
	 * adder를 정의하시오
	 * 
	 * 출력 형태 예) 10 + 20 = 30
	 * 
	 * @param op : char 연산자가 전달되는 변수
	 * @param x : int 첫번째 피연산자
	 * @param y : int 두번째 피연산자
	 */
	
	public void adder(char op, int x, int y) {
		if(op == '+') {
			System.out.printf("%d + %d = %d%n", x, y, x + y);
		} else {
			System.out.println("연산자를 잘 못 입력하셨습니다.");
		}
	}
	
	public boolean isEven(int input) {
		boolean result;
		
		if(input % 2 == 0) {
			result = true;
		} else {
			result = false;
		}
		System.out.printf("%d는 %b 입니다.%n", input, result);
		return result;
	}
	
	public void printTenTimes(int input) {
		for(int idx = 0; idx <10; idx ++) {
			System.out.printf("%d", (input+idx));
		}
	}
	
	
	
}
