package SaratogaCompetition18;

import java.util.*;

class NLAG_Grace {

	int mNum = 0, mNCon;
	ArrayList<String> mDCon = new ArrayList<String>();
	
	public static void main(String[] args) {
		NLAG_Grace sm = new NLAG_Grace();
		sm.test();
	}

	void test() {
		String[][] logList = {
				{"16", "1 2", "2 3", "3 4", "4 5", "5 6", "6 7", "4 8", "8 9", "9 10", "8 11", "11 12", "12 13", "12 14", "14 15", "15 16"},
				{"6", "1 2", "2 3", "3 4", "4 5", "5 6"},
				{"7", "1 2", "1 3", "3 4", "2 5", "5 6", "5 7"}
				}; 
		
		for (int i = 0; i < logList.length; ++i) { 
			proc(logList[i]);
			
			System.out.println("\n#" + (i+1) + " RESUSLT:" + (mDCon.size()+1) + "\n");
		}
	}
	
	void proc(String[] logs) {
		mNum = Integer.parseInt(logs[0]);
	    
		mNCon = mNum - 1;
		mDCon =  new ArrayList<String>();
		
		for (int i = 0; i < mNCon; ++i)
			mDCon.add(logs[i+1]);
		
		System.out.println(mDCon.toString() + "\n");

		proc();
	}
	
	void proc() {
		int n;
		int[] icons = new int[2];
		
		for (int i = 1; i <= mNum; ++i) {
			n = getNumConn(i, icons);
			
			if (n == 2) delete(i, icons);
		}
		
		
		System.out.println("\n" + mDCon.toString());
	}
	
	int getNumConn(int n, int[] icons) {
		int c = 0;
		int n0, n1;

		for (int i = 0; i < mNCon; ++i) {
			String con = mDCon.get(i);
			
			String[] bufs = con.split(" ");
			n0 = Integer.parseInt(bufs[0]);
			n1 = Integer.parseInt(bufs[1]);
			
			if (n0 == n || n1 == n) {
				if (c == 2) return (c+1);
				
				icons[c] = i;
				c++;
				continue;
			}
		}
		return (c);				
	}
	
	void delete(int n, int[] icons) {
		String str = "" + n;
		String con = "";
		String[] bufs;
		String s0 = mDCon.get(icons[0]);
		String s1 = mDCon.get(icons[1]);
		
		System.out.println("n=" + n + " - " + icons[0] + " " + s0 + " ; " + icons[1] + " " + s1);
				
		// Generate the new connection
		bufs = s0.split(" ");
		if (str.equals(bufs[0])) con += bufs[1];
		else con += bufs[0];
		// Get the city which is not the one to be deleted.
	
		con += " ";
		
		bufs = s1.split(" ");
		if (str.equals(bufs[0])) con += bufs[1];
		else con += bufs[0];
		// Get the other city for the new connection.

		mDCon.remove(icons[1]);
		mDCon.remove(icons[0]);
		mDCon.add(con);
		mNCon--;
		
		System.out.println(mDCon.toString());

		return;
	}
	
}
