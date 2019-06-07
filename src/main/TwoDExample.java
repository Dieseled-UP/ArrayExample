package main;

public class TwoDExample {

	public static void main(String[] args) {

		int[][] temps = {
				{1, -2, 3},
				{-4, -5, 6, 9},
				{7}
		};
		
		for (int i = 0; i < temps.length; i++) {
			
			for (int j = 0; j < temps[i].length; j++) {
				
				System.out.print(temps[i][j] + ", ");
			}
			
			System.out.println();
		}
		
		for (int[] elements: temps) {
			
			for(int num: elements) {
				
				System.out.print(num + ", ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
