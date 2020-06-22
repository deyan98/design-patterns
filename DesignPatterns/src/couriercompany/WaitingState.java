package couriercompany;

public class WaitingState implements State {
	
	private String stateName = "изчакване на клиент";

	@Override
	public void applyState(Context context) {
		context.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
