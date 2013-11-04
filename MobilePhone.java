public class MobilePhone extends OldPhone {
	public MobilePhone(String brand) {
		super(brand);
	}
	
	String[] callHistory = new String[10];
	int i=0;
	
	public void call(String number) {
		super.call(number);
		this.maintainCallHistory(number);
	}
	
	protected void maintainCallHistory(String number) {
		
		if (i<10) {
			callHistory[i]=number;
			i++;
		}
		else {
			String[] newCallHistory = new String[10];
			int j;
			for (j=1; j<10;j++) {
				newCallHistory[j-1]=callHistory[j];
			}
			newCallHistory[j-1]=number;
			callHistory=newCallHistory;
		}
	}
	
	public void ringAlarm(String alarmTxt) {
		System.out.println(alarmTxt);
	}
	
	public void printCallHistory() {
		for (int j=0; j<i; j++) {
			System.out.println(callHistory[j]);
		}
	}
}