package week1.day1;

import java.util.Scanner;

public class LearnConditions {	
	
	public void learnSwitch() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value1 :");
		int value1 = scan.nextInt();
		System.out.println("Enter The Value2 :");
		int value2 = scan.nextInt();
		System.out.println("Enter The option:");
		String option = scan.next();
		switch (option) {
		case "add":
			System.out.println("Add two Value "+(value1+value2));
			break;
		case "sub":
			System.out.println("sub two Value "+(value1-value2));
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	}
	
	
	
	
	//if and switch case both are condition 
	static int a = 25;
	public static void main(String[] args) {
		LearnConditions lc = new LearnConditions();
		lc.learnSwitch();
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value1 :");
		int value1 = scan.nextInt();
		System.out.println("Enter The Value2 :");
		int value2 = scan.nextInt();
		System.out.println("Enter The Value3 :");
		int value3 = scan.nextInt();
		if(value1 > value2 || value1 > value3) {
			System.out.println(value1+"Biggest one");
		}
		else if(value2 > value3) {
			System.out.println(value2+" Biggest one");
		} else {
			System.out.println(value3+" Biggest one");
		}
*/	}
}






