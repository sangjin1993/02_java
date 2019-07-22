package lecture;
/**
 *  2개의 지우개와 4개의 마커를 
 *  배열을 사용하여 사용/관리하는 테스트 클래스
 *  -----------------------------
 *  1. 마커(Marker)배열 marker를 선언
 *  	지우개(Eraser)배열 erasers를 선언
 *  
 *  2.markers 는 길이 4로 생성
 *    eraser는 길이 2로 생성
 *    
 *  markers[0] <==에는 순서대로
 *  ~
 *  marker[3] red, green, blue, black 마커를 저장
 *  
 *  erasers[0], [1]에는 순서대로
 *  		leftEraser, rightEraser를 저장
 *  
 *  3. foreach 를 사용하여
 *  (1)모든 마커를 한번씩 사용(use())
 *  (2)모든 지우개를 한번씩 사용(erase())
 *  (3)모든 지우개를 한번씩 한 겹 벗겨내기(peel())
 *  (4)모든 지우개의 상태 출력
 *  (5)모든 마커의 상태 출력
 * @author Administrator
 *
 */
public class LectureTestByArray {
		public static void main(String[] args) {
			
			//1. 선언
			Marker[] markers;
			Eraser[] erasers;
			
			//2. 초기화
			markers = new Marker[4];
			erasers = new Eraser[2];
			
			markers[0] = new Marker("빨강", true, true);
			markers[1] = new Marker("파란색",false, false );
			markers[2] = new Marker("초록", true, false);
			markers[3] = new Marker("검정", true, false);
			
			erasers[0] = new Eraser(3.5, 12.0, 5.5, 5, "검정색","왼쪽");
			erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "흰색","오른쪽");
			
			//3. 사용
			for(Marker marker : markers) {
				marker.use();
			}
			
			for(Eraser eraser : erasers) {
				eraser.earse();
			}
			
			for(Eraser eraser : erasers) {
				eraser.peel();
			}
			
			for(Eraser eraser : erasers) {
				eraser.print();
			}
			
			for(Marker marker : markers) {
				marker.print();
			}
		}
}
