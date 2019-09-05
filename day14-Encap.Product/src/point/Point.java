package point;

/**
 * x, y 좌표를 정수로 가지는
 * 수학의 한 점을 나타내는 클래스
 * @author admin
 *
 */

public class Point {

	// 1. 멤버변수
	private int x;
	private int y;
	
	// 2. 생성자
	// 기본생성자
	public Point() {
		
	}
	
	// 매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 3. 메소드
	// 접근자 / 수정자
	public int getX() {
		return x;
	}
	
	/**
	 * x좌표 값이 -10 ~ 10 사이만 유효하도록
	 * 유효성 체크 로직이 추가된 수정자
	 * @param x
	 */
	public void setX(int x) {
		if (x > 10) {
			this.x = 10;
		} else if (x < -10) {
			this.x = -10;
		} else {
			this.x = x;
		}
	}
	
	public int getY() {
		return y;
	}
	
	/**
	 * y좌표 값이 -10 ~ 10 사이만 유효하도록
	 * 유효성 체크 로직이 추가된 수정자
	 * @param y
	 */
	public void setY(int y) {
		if (y > 10) {
			this.y = 10;
		} else if (y < -10) {
			this.y = -10;
		} else {
			this.y = y;
		}
	}
	
	
	@Override
	public String toString() {
//		return "(" + x + ", " + y + ")";
		return String.format("(%d, %d)", x, y);
	}
	
	
	public double distanceFrom(Point q) {
		return Math.sqrt(Math.pow(q.getX() - x, 2) + Math.pow(q.getY() - y,  2));
	}
}
