package week1.day1;

 class MobilePhone {
	public String brand = "Mi";	
	protected String imei = "2456dsfghsdf";	
	public int age = 2;
	public void returnType() {
		
	}
	
	
	//public Integer age = 2;	
	//Syntax of the method
	//AccessModifier returnType methodName(Input Argument)
	public void dialCaller(String name) {
		System.out.println("calling "+name);
	}
	public void sendSMS(long mobileNumber) {
		System.out.println("Sending SMS to "+mobileNumber);
	}
	
	
	
	
	
	
	
	
	
	
	//public, private, default and protected
	//public - everyone 
	//private - only Class
	//default - anyone within same Package
	//protected anyone within same Package or inherited can access
	//return Type - can be a datatype or a class
	//text -> it's a String(Class)
	//number -> int (primitive dataType) or Integer (Class)
	//long number -> long Ex: MobileNumber
	//float or double (With Decimal)
	//short small number
	//boolean - true or false or Boolean(Class)
	//void - no return 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
