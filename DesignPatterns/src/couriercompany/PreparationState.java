package couriercompany;

public class PreparationState implements State {

	private String stateName = "състояние на подготовка";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}
}
