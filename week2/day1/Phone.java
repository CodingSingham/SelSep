package week2.day1;

public class Phone implements TRAI, WTO{

	public void dial() {
		System.out.println("Dialing");
	}
	public void reDial() {
		System.out.println("Re-Dialing");
	}
	public void speaker() {
		System.out.println("I m in Phone Class");
		System.out.println("loud Speaker");
	}
	@Override
	public void dialCaller() {
		System.out.println("Dial");
	}
	@Override
	public void sendSMS() {
		System.out.println("SMS");
	}
	@Override
	public void enableFingerPrint() {
		System.out.println("Unlocked");
	}
	@Override
	public void enableDualSIM() {
		System.out.println("Enabled Dual SIM");
	}
	@Override
	public void checkRadiation() {
		System.out.println("Checked");
	}
	@Override
	public void attachAadhar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}


