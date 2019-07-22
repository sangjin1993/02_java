package marker;
/**
 * 메소드 :
 * use() : void : "~색의 마커를 사용하고 있습니다." 출력
 * print() : void
 * 		: isNew 가 ture
 * @author Administrator
 *
 */
public class Marker {
	
	//1. 멤버변수 선언부
	/** 마커 잉크의 색상*/
	String color;
	/** 
	 * 마커의 뚜껑이 열려있는지 여부
	 * true :
	 * 
	 * */
	boolean isOpend;
	/** 새 마커인지 여부*/
	boolean isNew;
	
	
	Marker(){
		
	}
	
	Marker(String color){
		this();
		this.color = color;
	}
	
	Marker(String color, boolean isOpend){
		this(color);
		this.isOpend = isOpend;
	}
	
	Marker(String color, boolean isOp, boolean isNew){
		this(color, isOp);
		this.isNew = isNew;
	}
	
	//3. 메소드 선언부
	
	
	
	/**
	 * ~ 색의 마커를 사용하고 있습니다.
	 * 라는 문장을 출력하는 메소드
	 */
	public void use() {
		System.out.printf("%s색의 마커를 사용하고 있습니다.", color);
	
	}
	
	
	public void print() {
		String message = "마커 색상 : %s, %s, %s%n";
		String openStatus ="";
		String newStatus = "";
		
		if(isOpend) {
			openStatus = "뚜껑이 열려 있습니다.";
		} else {
			openStatus = "뚜껑이 닫혀있습니다.";
		}
		
		if (isNew) {
			newStatus = "새 마커입니다.";
		} else {
			newStatus = "다 쓴 마커입니다.";
		}
		
		System.out.printf(message, color, openStatus, newStatus);
		
	}
		
}
