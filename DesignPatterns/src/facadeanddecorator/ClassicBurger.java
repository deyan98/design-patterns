package facadeanddecorator;

public class ClassicBurger implements Burger {

	private String roll;
	private String meat;
	private String salad;

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public void setSalad(String salad) {
		this.salad = salad;
	}

	@Override
	public void makeBurger() {
				System.out.println("\n" +
                "Making a Burger... \n" +
                "Roll: " + roll + "\n" +
                "Meat: " + meat + "\n" +
                "Salad: " + salad);
	}

}
