package saratoga;

import java.util.Scanner;

public class NAAA {

	static int[][] arr;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(), M = s.nextInt();
		arr = new int[N][M];
		for(int i = 0; i < N; i++) for(int j = 0; j < M; j++) arr[i][j] = s.nextInt();
		
		int SA = add();
		int res = subtract(SA);
		System.out.println(res);
	}
	
	public static int add() {
		int count = 0;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[0].length; j++)
				if(arr[i][j] != 0) count += (1 + arr[i][j]*4);
		return count;
	}
	
	public static int subtract(int sum) {
		for(int i = 0; i < arr.length; i++) //check down
			for(int j = 1; j < arr[0].length; j++) {
				//System.out.println(i + " " + j + " " + Math.min(arr[i][j], arr[i][j-1]));
				//System.out.println(arr[i][j] + " " + arr[i][j-1]);
				sum -= Math.min(arr[i][j], arr[i][j-1])*2;
			}
		for(int i = 1; i < arr.length; i++) //check across
			for(int j = 0; j < arr[0].length; j++) {
				//System.out.println(i + " " + j + " " + Math.min(arr[i][j], arr[i-1][j]));
				//System.out.println(arr[i][j] + " " + arr[i-1][j]);
				sum -= Math.min(arr[i][j], arr[i-1][j])*2;
			}
		return sum;
	}
	
}
