package week1.day1;

public class LearnLoops {

	public static void main(String[] args) {		
		LearnLoops ll = new LearnLoops();
		ll.usingWhileLoop();
		ll.usingDoWhileLoop();
		ll.usingForLoop();
	}
	public void usingWhileLoop() {		
		int i =1, sum=0; // Initialize values
		while (i>=5) {   // Conditions
			sum=sum+i;
			i++;		 // Incrementor
		}
		System.out.println(sum);		
	}
	public void usingDoWhileLoop() {
		int i =1, sum=0;
		do {
			sum=sum+i;
			i++;
		}while(i>=5);
		System.out.println(sum);
	}	
	public void usingForLoop() {
		int sum = 0;
		for(int i=1; i<=5; i++) {
			sum = sum+i;
		}
		System.out.println(sum);		
		
	}

}






