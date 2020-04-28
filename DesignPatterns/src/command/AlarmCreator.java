package command;

public class AlarmCreator {
	
	private AlarmCommand alarm;

	public void setAlarm(AlarmCommand alarm) {
		this.alarm = alarm;
	}
	
	public void createAlarm() {
		System.out.println("Creating an alarm...");
		this.alarm.execute();
	}
	
	public void deleteAlarm() {
		System.out.println("Deleting an alarm...");
		this.alarm.execute();
	}
	
	public void copyAlarm() {
		System.out.println("Coping an alarm...");
		this.alarm.execute();
	}

}
