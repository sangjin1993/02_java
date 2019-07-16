package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		//각 팀별로 각 투수의 방어율 입력받아 배열에 저장한다.
		System.out.println("1선발, 2선발, 3선발, 4선발, 5선발 방어율 입력");
		for(int idx = 0; idx < ERA.length; idx++) {
			System.out.printf((idx + 1) + "번쨰 팀 1 ~ 5선발 투수 방어율 : %n");
			for(int ind = 0; ind < ERA[idx].length; ind++) {
				ERA[idx][ind] = scan.nextDouble();
			}
		}
		
		
		for(int idx = 0; idx < ERA.length; idx++) {
			for( int ind = 0; ind < ERA[idx].length; ind++) {
				if(min > ERA[idx][ind]) {
					min = ERA[idx][ind];		
				}
			}
		}
		
		System.out.printf("최고의 투수는 %f방어율 입니다." ,min);
		
	}

}
