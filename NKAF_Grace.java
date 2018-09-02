package SaratogaCompetition18;

import java.util.*;

@SuppressWarnings("resource")
public class NKAF_Grace {
	
	static HashMap<Integer, ArrayList<Integer>> name = new HashMap<Integer, ArrayList<Integer>>();
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int b = s.nextInt();
		for(int i = 1; i <= n;i++) {
			name.put(i, new ArrayList<Integer>());
		}
		for(int i = 0; i < b;i++) {
			int a = s.nextInt();
			name.get(a).add(s.nextInt());
		}
		for(int i = 1; i < n; i++ ) {
			//check(name.get(i), n);
		}
	}
	
}
