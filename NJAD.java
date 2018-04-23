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
			for(int j = 0; j < N; j++) {}
		}
		
	}
	
}
