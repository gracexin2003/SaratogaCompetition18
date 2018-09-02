package SaratogaCompetition18;

import java.util.*;

@SuppressWarnings("resource")
class NHAE_Grace {

	static int N;
	static class Object {
		int weight;
		ArrayList<Object> adjacent = new ArrayList<Object>();
		public Object(int w) {weight = w;}
	}
	static Object objects[];
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		N = s.nextInt(); objects = new Object[N];
		for(int i = 0; i < N; i++) objects[i] = new Object(s.nextInt());
		for(int i = 0; i < N-1; i++) {
			int a = s.nextInt(), b = s.nextInt();
			objects[a-1].adjacent.add(objects[b-1]);
			objects[b-1].adjacent.add(objects[a-1]);
		}
		//the hell?
		
		
	}
	
}
