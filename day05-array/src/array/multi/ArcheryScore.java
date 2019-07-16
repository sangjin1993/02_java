package array.multi;
/**
 * 3명의 양궁 선수가 맞힌 과녁의 점수를 각각 차시(9차시까지) 별로 배열에 입력하고
 * 전체 합산 점수가 가장 높은 선수의 인덱스와 점수를 출력
 */
import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int [3][9];
		int [] sum = new int[3];
		int max = 0;
		
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장
		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.printf((idx + 1) + "번째 선수를 입력:");
			for (int ind = 0; ind < score[idx].length; ind++) {
				score[idx][ind] = scan.nextInt();
			}
		}
		
		for(int idx =0; idx < score.length; idx++) {
			for(int ind = 0; ind < score[idx].length; ind++) {
				sum[idx] += score[idx][ind];
			}
		}
		
		for(int idx = 0; idx < sum.length; idx++) {
			if(sum[idx] > max) {
				max = sum[idx];
			}
		}
		System.out.println("우승 선수\n");
		System.out.printf("%d점으로  선수 입니다.", max);
	}

}
