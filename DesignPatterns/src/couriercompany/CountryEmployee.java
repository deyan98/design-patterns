package couriercompany;

public class CountryEmployee extends Employee {

	public CountryEmployee() {
		this.level = Employee.COUNTRY;
	}

	@Override
	protected void callEmployee(String call) {
		System.out.println("Пратка за страната -> " + call);

	}

}
