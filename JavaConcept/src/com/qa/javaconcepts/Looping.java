package com.qa.javaconcepts;

public class Looping {

	public static void main(String[] args) {

		/*int i = 1;
		int j = 1;
		do {
			System.out.println(i);
			i++;
		
		}
		while (i>=10);
		System.out.println("After loop");
		System.out.println(i);
		
		System.out.println("While loop ....");
	while (j<=10) {
	
		System.out.println(j);
		j++;
	}*/
	
/*	for (int k = 1;k<3 ;k++)
		
		System.out.println("Inside for loop" + k);*/
	
	int i=0;
	
	while (i < 3) {
		
		for( int j = 0; j < 4; j++ )
		{ 
			int k =  0;			
		do{
		
			System.out.println(" i---->  " + i + "  j ------->  "+ j + "  k------>  " + k );
			k++;
			
		}while(k<5);
		
		i++;	
	}
	
	}
	}
	}
