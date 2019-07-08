package control.ifstmt;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		int x;
		int y;
		int max=0;
		
		Scanner scan; 
		scan = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요"); // 위치 주위해서!!!
		
		x = scan.nextInt();
		y = scan.nextInt();
		
	
		if (x>y) 
			max = x;
			
		if (y>x) 
			max = y;
		
		if (x==y) 
			max = x;
		
		System.out.printf("입력된 두 값 x=%d, y=%d 중 큰은 값은 %d%n", x, y, max);
			
		
	}

}
