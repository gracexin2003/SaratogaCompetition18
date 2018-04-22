package SaratogaCompetition18.saratoga;

import java.util.*;

@SuppressWarnings("resource")
class NIAC {
	
	static char[][] grid;
	static int M, N, count = 0;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		M = s.nextInt(); N = s.nextInt();
		s.nextLine();
		grid = new char[M][N];
		for(int i = 0; i < M; i++) grid[i] = s.nextLine().trim().toCharArray();
		int ans = 0, maxI = 0;
		for(int i = 0; i < M; i++) {
			count = 0;
			move(i, 0, i);
			if(count>ans) {
				ans = count;
				maxI = i;
			}
		}
		System.out.println(ans + " " + (maxI+1));
		
	}
	
	public static void move(int startRow, int col, int end) {
		for(int c = col; c < N; c++) {
			if(grid[startRow][c]=='P') {
				if(startRow > 0) move(startRow-1, c+1, end);
				if(startRow < M-1) move(startRow+1, c+1, end);
				return;
			}
		}
		if(startRow==end)count++;
	}
	
}
