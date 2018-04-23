package SaratogaCompetition18;

import java.util.*;

@SuppressWarnings("resource")
class NJAD {

	static int N;
	static char[][] grid;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		N = s.nextInt(); grid = new char[N][N];
		s.nextLine();
		for(int i = 0; i < N; i++) grid[i] = s.nextLine().toCharArray();
		for(int i = 0; i < N; i++) {
			int count1 = 0, count2 = 0;
			for(int j = 0; j < N; j++) {
				if(grid[i][j] == 'F') count1++;
				if(grid[j][i] == 'F') count2++;
			}
			if(count1 == 1 || count2 == 1 || count1 == N || count2 == N) {
				System.out.println("RI");
				return;
			}
		}
		
	}
	
}
