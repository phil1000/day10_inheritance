public class PhoneLauncher {

	public void launch() {
		SmartPhone mySmartPhone = new SmartPhone("Motorola");
		System.out.println("this brand is " + mySmartPhone.getBrand());
		
		// call 10 numbers
		for (int i=0; i<10;i++) {
			mySmartPhone.call("0779202645" + i);
		}
		mySmartPhone.printCallHistory();
		// call another 5 numbers
		for (int i=0; i<5;i++) {
			mySmartPhone.call("0771177303" + i);
		}

		mySmartPhone.printCallHistory();
		mySmartPhone.ringAlarm("cockledoodledoo");
		// use the web
		mySmartPhone.browseWeb("http://www.bbc.co.uk/news/");
		
		// now call a number that will invoke internet calling 
		mySmartPhone.call("00123456");
		mySmartPhone.printCallHistory();
	}
	
	public static void main(String[] args) {
		PhoneLauncher myPL = new PhoneLauncher();
		myPL.launch();
	}
}