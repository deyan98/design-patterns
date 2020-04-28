package command;

public class CopyAlarm implements AlarmCommand {
	
	private Alarm copy;

	public CopyAlarm(Alarm copy) {
		this.copy = copy;
	}

	@Override
	public void execute() {
		this.copy.copyAlarm();

	}

}
