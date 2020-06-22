package couriercompany;

public abstract class Employee {
	
	public static int ABROAD = 1;
	public static int COUNTRY = 2;
	public static int INSIDEPLOVDIV = 3;
	
	protected int level; 
	
	protected Employee nextEmployee;

	public void setNextEmployee(Employee nexEmployee) {
		this.nextEmployee = nexEmployee;
	} 
	
	public void chooseEmployee(int level, String call, Observer observer) {
		if(this.level <= level) {
			this.callEmployee(call);
			return;
		}
		if(this.nextEmployee != null) {
			this.nextEmployee.chooseEmployee(level, call, observer);
			return;
		}
		
		System.out.println("Пратката не може да бъде обработена");
	}
	
	abstract protected void callEmployee(String call);
}
