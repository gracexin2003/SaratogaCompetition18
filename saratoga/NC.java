package SaratogaCompetition18.saratoga;

import java.util.*;

@SuppressWarnings("resource")
class NC {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		s.nextInt(); 
		int X = s.nextInt();
		s.nextLine();
		String str = s.nextLine();
		char[] pattern = str.trim().toCharArray();
		int Cs = 0, Ms = 0;
		for(char c : pattern) if(c=='C') Cs++;
		Ms = pattern.length-Cs;
		if(Cs>Ms*X) System.out.println("HAPPY");
		else System.out.println("SAD");
		
	}
	
}
