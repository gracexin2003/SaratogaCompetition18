package SaratogaCompetition18;

import java.util.*;

@SuppressWarnings("resource")
class NHAE_Grace {
	
	// dfs + dp for weights during backtrack
	
	public static int N;
	public static int[][] adjMat;
	public static int[] weights;
	public static boolean[] visited;
	public static int totalW;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		N = s.nextInt(); 
		weights = new int[N];
		adjMat = new int[N][N];
		visited = new boolean[N];
		for(int i = 0; i < N; i++) {
			weights[i] = s.nextInt();
			totalW += weights[i];
		}
		for(int i = 0; i < N-1; i++) {
			int a = s.nextInt()-1, b = s.nextInt()-1;
			adjMat[a][b] = 1;
			adjMat[b][a] = 1;
		}
		dfsWeights(0);
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) 
				System.out.print(adjMat[i][j] + " ");
			System.out.println();
		}
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int onew = 0;
			boolean b = false;
			for(int j = 0; j < N; j++) {
				if(adjMat[i][j] != 0) {
					if (onew > 0 && adjMat[i][j] != onew) {
						System.out.println("BREAK");
						b = true;
						break;
					}
					onew = adjMat[i][j];
					System.out.println(i + "," + j + " - " + onew);
				}
			}
			if(b) continue;
			ans++;
			System.out.println("ans = " + ans);
		}
		System.out.println(ans);
		
	}
	
	public static int dfsWeights(int i) {
		if(visited[i]) return 0;
		visited[i] = true;
		int weight = weights[i];
		int ws = 0;
		for(int x = 0; x < N; x++) {
			if(adjMat[i][x] != 0) {
				int w = dfsWeights(x);
				ws += w;
				adjMat[i][x] = w;
				adjMat[x][i] = totalW - w;
			}
		}
		visited[i] = false;
		return weight+ws;
	}
	
}
