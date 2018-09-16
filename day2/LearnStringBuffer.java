package week1.day2;

public class LearnStringBuffer {

	public static void main(String[] args) {
    StringBuilder buffer = new StringBuilder("Testleaf");
    System.out.println(buffer);
    buffer.append(" Chennai");
    System.out.println(buffer); 
    buffer.insert(10, 'l');
    System.out.println(buffer); 
    System.out.println(buffer.reverse()); 
	}

}




