package week2.day1;

public class MobilePhone extends Phone implements TRAI{
	
	public void sendSMS() {
		System.out.println("SMS");
		
	}
	public void takePics() {
		System.out.println("Clicked");
	}
	@Override
	public void speaker() {
		super.speaker();
		System.out.println("I m in MobilePhone Class");
		System.out.println("speaking using headset");
	}
	 public static void main(String[] args) {
		 MobilePhone mp = new MobilePhone();
		 mp.speaker();
		 
		 
		/*Phone ph = new Phone();
		ph.dial();
		ph.speaker();
	
		MobilePhone mp = new MobilePhone();
		mp.sendSMS();
		mp.dial();
		mp.speaker();
		
		Phone mp1 = new MobilePhone();
		mp1.speaker();
		mp1.dial();*/
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
