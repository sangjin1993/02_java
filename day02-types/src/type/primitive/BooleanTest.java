package type.primitive;

public class BooleanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 선언
		boolean isLikeBaseball;
		boolean isExists;
		boolean isHave;
		boolean isEnd = false; // 선언과 동시에 초기화
		
		// 2. 초기화
		isLikeBaseball = true;
		isExists = true;
		isHave = false;
		
		// 3. 사용
		System.out.println("isLikeBaseball=" + isLikeBaseball);
		System.out.println("isExists=" + isExists);
		System.out.println("isHave=" + isHave);
		System.out.println("isEnd=" + isEnd);
		System.out.println(isLikeBaseball+"isLikeBaseball"+isLikeBaseball);
	}

}
