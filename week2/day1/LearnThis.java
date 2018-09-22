package week2.day1;

public class LearnThis {

	int num = 20;
	public static void main(String[] args) {
		LearnThis lt = new LearnThis();
		lt.user();
	}
	
	public void user() {
		int num = 10;
		System.out.println(this.num);
	}
}



