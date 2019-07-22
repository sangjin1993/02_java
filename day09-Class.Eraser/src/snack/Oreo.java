package snack;
/**
 * 오레오 쿠키를 정의하는 클래스
 * -----------------------------------
 * 속성 : 
 * cream 	 : String : 바닐라, 초코, 딸기, 말차
 * radius 	 : double : 오레오 쿠키 1개의 반지름 길이
 * thickness : double : 오레오 쿠키 1개의 두깨
 * ------------------------------------
 * 생성자 : 기본생성자, 중복된 this, this() 로 정의하는 생성자
 * 총 4개의 생성자 중복정의
 * ------------------------------------
 * 메소드 :
 * print() : void : 오레오 쿠키의 상태 출력
 * changeCream(String cream) : void 
 * :		매개 변수로 입력된 cream 값으로 오레오 쿠키의 크림을 변경함
 * 
 * @author Administrator
 *
 */
public class Oreo {
	// 1. 맴버 변수 선언부
	String cream;
	double radius;
	double thickness;
	
	
	
	// 2. 생성자 선언
	Oreo(){
		
	}
	
	Oreo(String cream){
		this();


	}
	
	Oreo(String cream, double radius){
		this(cream);
		this.radius = radius;
	}
	
	Oreo(String cream, double radius, double thickness){
		this(cream, radius);
		this.thickness = thickness;
	}
	
	// 3. 메소드 선언
	
	public void print() {
		System.out.printf("%s의 쿠키는 %2.1f이고 %2.1f 입니다%n", cream, radius, thickness);
	}
	
	public void changeCream(String cream) {
		this.cream = cream;
	}
}
