package marker;
/**
 * 화이트 보드 마커를 사용하는 테스트 클래스
 * @author Administrator
 *
 */
public class MarkerTest {

	public static void main(String[] args) {
		//1. 선언
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		
		//2. 초기화
		red = new Marker("빨강", true, true);  
		blue = new Marker("파란색",false, false ); 
		green = new Marker("초록", true, false);
		black = new Marker("검정", true, false); 
		      
		
		//3. 사용
		red.print();  
		blue.print(); 
		green.print();
		black.print();
		      
		
		//(2)파랑, 검정 마커 사용
		blue.use();
		black.use();
	}

}
