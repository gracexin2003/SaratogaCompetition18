package SaratogaCompetition18;

import java.util.*;

@SuppressWarnings ("resource")
class NHAE_Grace {
	
	// dfs + dp for weights during backtrack
	
	public static int N;
	public static List[] adjList;
	public static int[] weights;
	public static boolean[] visited;
	public static int totalW;
	
	public static class List { ArrayList<Object> l = new ArrayList<Object>(); }
	public static class Object { 
		int weight, node; 
		public Object(int w, int n) {
			weight = w; node = n;
		}
		public String toString() {
			return weight + "/" + node;
		}
	}
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		N = s.nextInt(); 
		weights = new int[N];
		adjList = new List[N];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			weights[i] = s.nextInt();
			totalW += weights[i];
		}
		for (int i = 0; i < N; i++) adjList[i] = new List();
		for (int i = 0; i < N-1; i++) {
			int a = s.nextInt()-1, b = s.nextInt()-1;
			adjList[a].l.add(new Object(0, b));
			adjList[b].l.add(new Object(0, a));
		}
		
		for (int i = 0; i < N; i++)
			System.out.println(adjList[i].l.toString());
		System.out.println();
		
		dfsWeights(0);
		
		for (int i = 0; i < N; i++)
			System.out.println(adjList[i].l);
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int onew = 0;
			boolean b = false;
			for (Object o : adjList[i].l) {
				if(onew > 0 && o.weight != onew) {
					System.out.println("BREAK");
					b = true;
					break;
				}
				onew = o.weight;
				System.out.println(o.node + " - " + onew);
			}
			if (b) continue;
			ans++;
			System.out.println("ans = " + ans);
		}
		System.out.println(ans);
		
	}
	
	public static int dfsWeights (int i) {
		if (visited[i]) return 0;
		visited[i] = true;
		int weight = weights[i];
		int ws = 0;
		for (Object o : adjList[i].l) {
			int w = dfsWeights(o.node);
			ws += w;
			o.weight = w;
			adjList[o.node].l.get(index(o.node, i)).weight = totalW - w;
		}
		visited[i] = false;
		return weight+ws;
	}

	public static int index(int listIndex, int wantedIndex) {
		int i = 0;
		for (Object o : adjList[listIndex].l) {
			if (o.node == wantedIndex) return i;
			i++;
		}
		return 0;
	}
	
}
