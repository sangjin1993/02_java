package lecture;
/**
 * 마커(Marker)와 칠판지우개(Eraser) 를 사용하여
 * 마커를 쓰고 지우개로 지워보는 테스트 클래스
 * @author Administrator
 *
 */
public class LectureTset {

	public static void main(String[] args) {
	// 1.선언 : 지우개 2개, 마커 4개
	Eraser leftEraser;
	Eraser rightEraser;
	
	Marker red;
	Marker blue;
	Marker green;
	Marker black;
	
	//2. 초기화
	//1) 왼쪽 지우개는 기본생성자로 초기화
	leftEraser = new Eraser(3.5, 12.0, 5.5, 5, "검정색","왼쪽");
	
	//2) 오른쪽 지우개는 매개변수 생성자로 초기화
	rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색","오른쪽");
	
	red = new Marker("빨강", true, true);  
	blue = new Marker("파란색",false, false ); 
	green = new Marker("초록", true, false);
	black = new Marker("검정", true, false); 
	
	//3. 사용
	// (1) 네개의 마커를 한번씩 사용
	red.use();
	blue.use();
	green.use();
	black.use();
	
	// (2) 오른쪽 ,왼쪽 지우개로 사용한 내용 지우기
	leftEraser.earse();
	rightEraser.earse();
	
	// (3) 오른쪽 지우개 한 겹 벗겨내기
	rightEraser.peel();
	
	// (4) 오른쪽 지우개 상태 출력
	rightEraser.print();
	
	
	
	
	
	
	
	}
}
