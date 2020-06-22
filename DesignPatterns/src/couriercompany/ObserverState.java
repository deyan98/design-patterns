package couriercompany;

public class ObserverState implements Observer {
	
	private String name;
	private Context context;
	
	public ObserverState(String name) {
		this.setName(name);
	}

	@Override
	public void setObserver(Context context) {
		if(this.name == "��������� �� ����������") {
			this.context = context;
			System.out.println(" -> ��������� �� �������� �� ������");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
