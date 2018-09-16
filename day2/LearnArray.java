package week1.day2;

import java.util.Scanner;

public class LearnArray {
	public static void main(String[] args) {
		//int salary[] = {23000, 45000, 67000, 89000};
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int salaries[] = new int[size];
		for(int i =0; i<salaries.length; i++) {
			salaries[i] = sc.nextInt();
		}
		/*for(int i =0; i<salary.length; i++) {
			System.out.println(salary[i]);
		}*/
		for(int salary : salaries) {
			System.out.println(salary);
		}
	}
}





