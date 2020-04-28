package command;

public class Alarm {
	
	private Boolean alarmOn;
	private Boolean copyAlarm;
	
	public void turnOn() {
		System.out.println("\n - Alarm set for 12:15\n");
		this.alarmOn = true;
	}
	
	public void turnOff() {
		System.out.println("\n - Alarm for 12:15 deleted succesfully");
		this.alarmOn = false;
	}
	
	public void copyAlarm() {
		System.out.println("\n - Alarm for 12:15 copied succesfully\n");
		this.copyAlarm = true;
	}
}
