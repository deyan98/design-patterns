package command;

public class AlarmCommandMain {

	public static void main(String[] args) {
		
		AlarmCreator createAlarm = new AlarmCreator();
		Alarm alarm = new Alarm();
		
		AlarmCommand turnOnAlarm = new TurnOnAlarm(alarm);
		AlarmCommand turnOffAlarm = new TurnOffAlarm(alarm);
		AlarmCommand copyAlarm = new CopyAlarm(alarm);

		createAlarm.setAlarm(turnOnAlarm);
		createAlarm.createAlarm();
		
		createAlarm.setAlarm(copyAlarm);
		createAlarm.copyAlarm();
		
		createAlarm.setAlarm(turnOffAlarm);
		createAlarm.deleteAlarm();
		
	}

}
