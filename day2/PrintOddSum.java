package week1.day2;

import java.util.Scanner;

public class PrintOddSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int sum =0;
		int array[] = new int[size];
		for(int i =0; i< size;i++) {
			array[i] = sc.nextInt();
		}
		for (int i : array) {
			if(i%2!=0) {
				sum = sum+i;	
			}
		}
		System.out.println(sum);

	}

}







