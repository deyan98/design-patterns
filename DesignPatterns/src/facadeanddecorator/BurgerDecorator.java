package facadeanddecorator;

public abstract class BurgerDecorator implements Burger {
	
	protected Burger decoratedBurger;
	protected Burger cheese;

	public BurgerDecorator(Burger decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	@Override
	public void makeBurger() {
		this.decoratedBurger.makeBurger();

	}

}
