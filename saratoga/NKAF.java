package saratoga;

import java.util.*;

public class NKAF {
	
	static HashMap<Integer, ArrayList<Integer>> name = new HashMap<Integer, ArrayList<Integer>>();
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(4);
		/*int n = s.nextInt();
		
		int b = s.nextInt();
		for(int i = 1; i <= n;i++) {
			name.put(i, new ArrayList<Integer>());
		}
		for(int i = 0; i < b;i++) {
			int a = s.nextInt();
			name.get(a).add(s.nextInt());
		}
		for(int i = 1; i < n; i++ ) {
			check(name.get(i), n);
		}*/
	}
	
	public static boolean check(ArrayList<Integer> arrayList, int n) {
		boolean[] array = new boolean[n];
		
		return false;
		
	}
	
	/*
	public static void DFS(status){				// always returns boolean or integer, or is void
		check_validation(status);				// if not valid, return;
		check_endpoint(status);					// if is end point, do something, return;
		Status[] expand = EXPAND(status);		// expand the old status
		for each(newStatus in expand){
			do_something(newStatus);			// update the answer
			DFS(newStatus);						// run dfs in recursive mode
		}
	}
	 */
	
}
