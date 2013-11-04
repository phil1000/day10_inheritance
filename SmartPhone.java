public class SmartPhone extends MobilePhone {

	public SmartPhone(String brand) {
		super(brand);
	}

	public void call(String number) {
		if (number.substring(0,2).equals("00")) {
			System.out.println("Using the internet to phone " + number);
			this.maintainCallHistory(number);
		}
		else {
			super.call(number);
		}
	}
	
	public void browseWeb(String myString) {
		System.out.println(myString);
	}
	
}