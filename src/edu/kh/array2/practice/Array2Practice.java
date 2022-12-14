package edu.kh.array2.practice;

public class Array2Practice {

	public void practice1() {
		
		int[][] arr = new int[3][3];
		
		System.out.println("[실행 화면]");
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				
				System.out.printf("(%d, %d)",row, col);
			}
			System.out.println();
		}
		
		
	}
	
	public void practice2() {
		
		int[][] arr = new int[4][4];
		
		int sum = 0;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++){
				sum += 1;
				System.out.printf("%3d", sum);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		
		int row = 4;
		int col = 4;
		int mul = row * col;
		
		int[][] arr = new int[row][col];
		
		for(int x = 0; x < arr.length; x ++) {
			for(int y = 0; y < arr[x].length; y++) {
				
				arr[x][y] = mul;
				mul--;
				System.out.printf("%3d", arr[x][y]);
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	public void practice4() {
		
		int row = 4;
		int col = 4;
		
		
		int[][] arr = new int[row][col];
		
		for(int x = 0; x < row - 1; x++) {
			for(int y = 0; y < col - 1; y++) {
				int random = (int)(Math.random()*10)+1;
				arr[x][y] = random;
				System.out.printf("%3d", arr[x][y]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	public void practice5() {}
	
	public void practice6() {}
	
	
	
	
	
}
