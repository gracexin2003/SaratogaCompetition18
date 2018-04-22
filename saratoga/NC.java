package saratoga;

import java.util.*;

class NC {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int M = s.nextInt(), X = s.nextInt(), N = s.nextInt();
		String str = s.nextLine();
		char[] pattern = str.trim().toCharArray();
		int Cs = 0, Ms = 0;
		for(char c : pattern) if(c=='C') Cs++;
		Ms = pattern.length-Cs;
		if(Cs>Ms*X) System.out.println("HAPPY");
		else System.out.println("SAD");
		
	}
	
}
