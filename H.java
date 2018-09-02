import java.util.*;
public class H {
	static int[] w;
	static List[] connect;
	static boolean[] v;
	
	public static class List {
		ArrayList<Integer> l = new ArrayList<>();
	}
	
	public static void main(String[] args){
		Scanner s;
	}
	
	public static ArrayList<Integer> weights (int n){
		ArrayList<Integer> ws = new ArrayList<>();
		for (int i = 0; i<connect[i].l.size(); i++){
			if(connect[n].l.get(i) == n) continue;
			ws.add(dfs(connect[n].l.get(i), 0));
		}
		return ws;
	}
	
	public static int dfs(int index, int total){
		total += w[index];
		v[index] = true;
		ArrayList<Integer> temp = connect[index].l;
		for (int i = 0; i<temp.size(); i++){
			if(v[i]) continue;
			total += dfs(temp.get(i), total);
		}
		v[index] = false;
		return total;
	}
	
}
