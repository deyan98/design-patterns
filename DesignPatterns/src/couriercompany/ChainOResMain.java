package couriercompany;

public class ChainOResMain {

	private static Employee getChain() {
		
		Employee abroad = new AbroadEmployee();
		Employee country = new CountryEmployee();
		Employee insidePlovdiv = new InsidePlovdivEmployee();
		
		insidePlovdiv.setNextEmployee(country);
		country.setNextEmployee(abroad);
		
		return insidePlovdiv;
	}
	
	public static void main(String[] args) {
		
		Employee chain = getChain();
		
		Context abroad = new Context("");
		Context country = new Context("");
		Context insidePlovdiv = new Context("");
		PreparationState preparationState = new PreparationState();
		WaitingState waitingState = new WaitingState();
		
		preparationState.applyState(abroad);
		waitingState.applyState(country);
		preparationState.applyState(insidePlovdiv);
		
		String firstEmployeeState = abroad.getState().getStateName();
		String secondEmployeeState = country.getState().getStateName();
		String thirdEmployeeState = insidePlovdiv.getState().getStateName();
		
		Observer firstEmloyeeObserver = new ObserverState(firstEmployeeState);
		Observer secondEmloyeeObserver = new ObserverState(secondEmployeeState);
		Observer thirdEmloyeeObserver = new ObserverState(thirdEmployeeState);
		
		chain.chooseEmployee(1, firstEmployeeState, firstEmloyeeObserver);
		chain.chooseEmployee(2, secondEmployeeState, secondEmloyeeObserver);
		chain.chooseEmployee(3, thirdEmployeeState, thirdEmloyeeObserver);

	}
} 
