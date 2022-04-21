package MavenNaresh.project_example;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=100;
		int i,j;
		int total=0;
		for (i = 2; i <= n; i++) {
			int temp=0;
			 for (j = 2; j < i; j++) {
				
				if(i % j == 0) { 
				 temp++;
				}
			 }
				if (temp==0) {
					System.out.println("PRIME No."+i);
					total++;
				}
				else {
					//System.out.println("Not a PRIME No."+i);
				}
		
	}
		System.out.println(total);
	}
}
	
	
	
	

