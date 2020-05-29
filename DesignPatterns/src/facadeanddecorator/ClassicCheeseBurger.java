package facadeanddecorator;

public class ClassicCheeseBurger extends BurgerDecorator {
	
	public String cheese;

	public ClassicCheeseBurger(Burger decoratedBurger) {
		super(decoratedBurger);
		// TODO Auto-generated constructor stub
	}
	
	public void makeBurger() {
		decoratedBurger.makeBurger();
		setCheeseBurger(decoratedBurger);
	}
	
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	
	private void setCheeseBurger(Burger decoratedBurger) {
		
		System.out.println("- Adding " + cheese);
		

	}

}
