package week1.day1;

public class MyPhone {

	public static void main(String[] args) {
		//Syntax to call another class
		//ClassName objectName = new ClassName();
		MobilePhone my = new MobilePhone();
		//Syntax to call a method
		//ObjectName.MethodName(); or ObjectName.variable;
		my.dialCaller("Ravi");
		String imei = my.imei;
		System.out.println(imei);
		int age = my.age;
		System.out.println(age);
	}

	
	
	
	
	
	
}
