package SaratogaCompetition18;

import java.util.*;

@SuppressWarnings("resource")
public class NKAF_Grace {
	
	public static boolean[] totalV;
	public static boolean[] visited;
	public static int[][] adjMat;
	public static int N, M;
	public static int count;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		N = s.nextInt(); M = s.nextInt();
		totalV = new boolean[N];
		adjMat = new int[N][N];
		for(int i = 0; i < M; i++) 
			adjMat[s.nextInt()-1][s.nextInt()-1] = 1;
		
		boolean hasAns = false;
		for(int i = 0; i < N; i++) {
			if(totalV[i]) continue;
			visited = new boolean[N];
			count = 0;
			if(dfs(i)) {
				System.out.println(i+1);
				hasAns = true;
			}
			for(int j = 0; j < N; j++)
				totalV[j] = totalV[j] || visited[j];
		}
		if(!hasAns) System.out.println(-1);
		
	}
	
	public static boolean dfs(int room) {
		if(visited[room]) return false;
		visited[room] = true;

		count++;
		if(count >= N) return true;
		
		for(int i = 0; i < N; i++)
			if(adjMat[room][i] == 1 && dfs(i)) return true;
		
		return false;
	}
	
}
