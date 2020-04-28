package command;

public class TurnOffAlarm implements AlarmCommand {

	private Alarm alarm;
	
	public TurnOffAlarm(Alarm alarm) {
		this.alarm = alarm; 
	}
	
	@Override
	public void execute() {
		this.alarm.turnOff();

	}

}
