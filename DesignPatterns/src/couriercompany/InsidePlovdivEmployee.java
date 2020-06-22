package couriercompany;

public class InsidePlovdivEmployee extends Employee {

	public InsidePlovdivEmployee() {
		this.level = Employee.INSIDEPLOVDIV;
	}

	@Override
	protected void callEmployee(String call) {
		System.out.println("Пратка за Пловдив -> " + call);

	}
}
