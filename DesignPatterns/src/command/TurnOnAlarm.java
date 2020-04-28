package command;

public class TurnOnAlarm implements AlarmCommand {
	
	private Alarm alarm;

	public TurnOnAlarm(Alarm alarm) {
		this.alarm = alarm;
	}

	@Override
	public void execute() {
		this.alarm.turnOn();

	}

}
