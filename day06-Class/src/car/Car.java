package car;
/**
 * Car(자동차)라는 타입을 정의(선언)하는 클래스
 * 
 * Car(자동차) 는 기본으로 제공하는 타입아 이니다.
 * (기본 제공 타입? : ㄴㅅ갸ㅜㅎ, ㄴㅊ무ㅜㄷㄱ...)
 * 클래스 디자인 탈 때는 추상화 과정(Adstraction) 힐요
 * 
 * 속성 : 현재의 속도 (===>변수)
 * 기능 : 가속, 정지 (===>메소드)
 * @author Administrator
 *
 */
public class Car {
	//1. 멤버 변수 선언부 : 상태저장을 위한선언
	int velocity;
	String nickname;
	
	//2.생성장 선언부		초기화를 위한 선언
	//생략
	
	//.3메소드 선언부		사용을 위한 선언
	//(1) 가속 기능 : 가속된 결과 현재 속도가 얼마인지 리턴
	public int accelerate(int value) {
		velocity += value;
		
		return velocity;
		}	
		
	//(2 정지 기능 : 속도를 완전히
		public void stop() {
			velocity = 0;
		}
		
		// (3) 차의 별명을 설정하는 기능 : nickname 필드에 값을 저장
		public void setNickname(String carnickname) {
			nickname = carnickname;
		}
		
		public void print() {
			System.out.printf("이 차의 현재 속도 : %d km/h, 차의 별명:%s %n%n", velocity, nickname);
		}
		
	
	
	
	
	
	
	
	
}
