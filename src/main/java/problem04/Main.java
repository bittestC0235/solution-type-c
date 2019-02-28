package problem04;

import java.util.Random;

public class Main {
	

	public static int test[][] = new int[2][9];
	public static int arr[][] = new int[9][9];
	public static int row=0;
	public static int column=0;
	public static void main(String[] args) {
		
		int count=0;
		
		int randomNumber = (int)(Math.random()*10);
		int randomNumber2 = (int)(Math.random()*10);	
		boolean isBreak=false;
		int val=0;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				arr[i-1][j-1] = i*9;
			}
		}
		
		while(count<18) {
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					
					if(test(arr[randomNumber][randomNumber2])) {
						count++;
						isBreak=true;
					}
					
					
				}
				
				
				 if(isBreak) { break; }
				 
			}
		}
		
		
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<test[0].length; j++) {
				System.out.print(test[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
	public static boolean test(int v) {
		
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<test[0].length; j++) {
				if(test[i][j]==v) {
					return false;
				}

			}
		}
		if(column==test[0].length) {
			row++;
			column=0;
		}
		test[row][column++] = v;
		
		
		return true;

	}
}