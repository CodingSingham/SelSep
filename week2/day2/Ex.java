package week2.day2;

public class Ex {
	public static void main(String[] args)  {
		//		Thread.sleep(5000);
		int a = 10;
		try {
			if (a < 18) {
				throw (new ArithmeticException());

			}
			}catch (ArithmeticException e) {
				System.out.println("Exception caught");
			}
	}

}
