package week2.day1;

public class OverLoading {

	public OverLoading() {
		this(10);
		System.out.println("constructor with no arg");
	}
	public OverLoading(int a) {
		this(7.5f);
		System.out.println("constructor with int arg");
	}
	public OverLoading(float f) {
		System.out.println("constructor with float arg");
	}

	public void print() {
		System.out.println("Printed");
	}
	public void print(int num) {
		System.out.println(num);
	}
	public void print(int num, int num1) {
		System.out.println(num+" "+num1);
	}
	public void print(String txt) {
		System.out.println(txt);
	}
	public static void main(String[] args) {
		OverLoading old =  new OverLoading();
		
		//old.print(10, 20);
		

	}

}






