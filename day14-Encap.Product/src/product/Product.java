package product;

/**
 * 전자제품을 판매하는 매장에서
 * 관리하는 대상인 "제품"을 정의하는 클래스
 * ----------------------------------------
 * 멤버변수(private, protected, public을 붙이지 말 것)
 * 
 * 제품번호 : pcode    : String : <== "P001"
 * 제품 명  : pname    : String : <== "삼성 지펠 .... "
 * 가격     : price    : int    : 진짜 그 제품 가격
 * 재고수량 : quantity : int    
 * ----------------------------------------
 * 생성자(public 으로 선언)
 * 
 * 기본생성자, 매개변수받는 생성자 필드 1씩 늘려가며
 * this, this() 사용
 * ----------------------------------------
 * 메소드(public 으로 선언)
 * 
 * print() : void
 *   ==> 제품의 상태를 출력
 *   
 * toString() : String
 *   ==> 이 제품을 대표하는 문자열을 리턴
 *   ==> String.format() 으로 문자열 생성후 리턴
 *   
 * discount(double percentage) : int
 *   ==> 입력된 퍼센트만큼 할인된 가격을 리턴
 *   
 * sell(int amount) : void
 *   ==> 매장에서 판매(출고)되어 
 *   ==> 재고수량(quantity)이 amount 만큼 줄어들도록 반영
 *   ==> 재고수량이 0보다 작아질 수 없도록 제한
 *   
 * buy(int amount) : void
 *   ==> 매장에 입고되어 재고수량(quantity)이 
 *   ==> amount 만큼 늘어나도록 반영
 * 
 * ===============================================
 * 작성시 주의 할 것.
 * 
 * 각 필드를 선언할 때, 필드에대한 설명을 문서 주석으로 달 것.
 * 각 생성자 선언할 때, 문서 주석 달 것
 * 각 메소드 선언할 때, 메소드 설명을 문서 주석으로 달 것.
 * ----------------------------------------------- 
 * @author admin
 *
 */

public class Product {

	// 1. 멤버 변수 선언부
	private String pcode;
	private String pname;
	private int price;
	private int quantity;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	Product() {
		
	}
	
	/**
	 * 제품 코드 필드만 초기화하는 생성자
	 */
	Product(String pcode) {
		this.pcode = pcode;
	}
	
	Product(String pcode, String pname, int price, int quantity) {
		this(pcode);
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 3. 메소드 선언부
	/**
	 * 제품 정보를 출력
	 */
	public void print() {
		System.out.println(this);
	}
	
	/**
	 * 입력된 percentage만큼 할인을 진행할 경우
	 *  판매 가격이 얼마가 되는지 계산하여 리턴
	 * @param percentage
	 * @return
	 */
	public int discount(double percentage) {
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * percentage);
		}
		
		return price;
	}
	
	/**
	 * 제품을 출고(판매)하고 재고 수량을 감소시킨다.
	 * @param amount
	 */
	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을 때만 출고함.
		if (this.quantity >= amount) {
			this.quantity -= amount;
		}
	}
	
	/**
	 * 제품이 입고되어 재고 수량을 증가시킨다.
	 * @param amount
	 */
	public void buy(int amount) {
		// 입고된 만큼 재고수량 증가 후 저장 반영
		this.quantity += amount;
	}
	
	@Override
	public String toString() {
		String strProduct = String.format("제품 정보 [제품코드 : %s, 제품명 : %s, 가격 : %d, 재고수량 : %d]", pcode, pname, price, quantity);
		return strProduct;
	}

	
	// 접근자, 수정자
	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
