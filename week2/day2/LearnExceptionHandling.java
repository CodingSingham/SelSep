package week2.day2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Thread.sleep(1000);
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a / b);
		} /*catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("you should not enter 0");
		}catch (InputMismatchException e) {
			System.out.println("should not enter character");
		}*/catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("DB closed");
		}
	}

	
	
	
	





}
