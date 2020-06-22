package couriercompany;

public class AbroadEmployee extends Employee{
	
	@Override
	protected void callEmployee(String call) {
		System.out.println("Пратка за чужбина -> " + call);

	}
}
