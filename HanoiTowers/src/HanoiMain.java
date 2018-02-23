import java.util.Scanner;

public class HanoiMain {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		char a='A',
			 b='B',
			 c='C';
		System.out.print("How to solve Hanoi Tower Puzzle:\nHow many rings?\n>");
		int n = s.nextInt();
		
		System.out.println("\nMove all "+n+" rings from tower "+a+" to tower "+c+" using tower "+b+
							"\nRules:"+
							"\n1) There can only be one ring out of any tower at a time."+
							"\n2) There can never be a larger ring on top of a smaller ring.\n");
		if(n<=0){
			System.out.println("There are no rings to move!");
		} else{
			System.out.println("Instructions for "+n+" rings:");
			hanoi(a,b,c,n);
			System.out.println("\nDone!");
		}
		
	}
	
	public static void hanoi(char a, char b, char c, int n){
		if(n>0){
			hanoi(a,c,b,n-1);
			System.out.println("Move ring from tower "+a+" to tower "+c);
			hanoi(b,a,c,n-1);
		}
	}
	
	/*
		Hanoi:
		Move all n rings from tower A to tower C
		Rules:
		1) There can only be 1 ring out of any tower at a time.
		2) There can never be a larger ring on top of a smaller ring.
		
		3 towers: A, B, C
		n = 3
		
		A = 3:x,y,z
		B = 0
		C = 0
		
		A to C
		A = 2:x,y
		B = 0
		C = 1:z
		
		A to B
		A = 1:x
		B = 1:y
		C = 1:z
		
		C to B
		A = 1:x
		B = 2:y,z
		C = 0
		
		A to C
		A = 0
		B = 2:y,z
		C = 1:x
		
		B to A
		A = 1:z
		B = 1:y
		C = 1:x
		
		B to C
		A = 1:z
		B = 0
		C = 2:x,y
		
		A to C
		A = 0
		B = 0
		C = 3:x,y,z 
	*/
	
}
