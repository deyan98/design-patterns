package facadeanddecorator;

public class ClassicEggBurger extends BurgerDecorator {
	
	private String egg;

	public ClassicEggBurger(Burger decoratedBurger) {
		super(decoratedBurger);
		// TODO Auto-generated constructor stub
	}
	
	public void makeBurger() {
		decoratedBurger.makeBurger();
		setCheeseBurger(decoratedBurger);
	}
	
	public void setEgg(String egg) {
		this.egg = egg;
	}
	
	private void setCheeseBurger(Burger decoratedBurger) {
		
		System.out.println("- Adding " + egg);
		

	}

}
