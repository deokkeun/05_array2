package edu.kh.array2.practice;

import java.time.Year;
import java.util.Scanner;
import java.util.function.BiConsumer;

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
		
		for(int ro = 0; ro < arr.length; ro ++) {
			for(int co = 0; co < arr[ro].length; co++) {
				arr[ro][co] = (int)(Math.random()*10)+1;
				
				System.out.printf("%3d",(arr[ro][co]));
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();

		System.out.print("열 크기 : ");
		int col = sc.nextInt();
		
		boolean flag = (0 < row && row <11) && (0 < col && col <11);
		
		if(flag) {
			int[][] arr = new int[row][col];
			
			for(int ro = 0; ro < arr.length; ro++) {
				for(int co = 0; co < arr[ro].length; co++) {
					arr[ro][co] = (int)(Math.random()*26)+65; 
					System.out.printf("%2c", (char)arr[ro][co]);
				}
				System.out.println();
			}
		} else {
			System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int input = sc.nextInt();
		
		int[][] arr = new int[input][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "열의 크기 : ");
			int in = sc.nextInt();
			arr[i] = new int[in];
		}

		int num = 97;
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr[x].length; y++) {
				if(arr[0][0] == 0) {
					arr[0][0] = num;
					System.out.print((char)arr[x][y] + " ");
				} else {
					arr[x][y] = ++num;
					System.out.print((char)arr[x][y] + " ");
				}
			}
			System.out.println();
		}
	}
}
