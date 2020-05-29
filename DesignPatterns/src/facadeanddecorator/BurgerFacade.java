package facadeanddecorator;

public class BurgerFacade{

	private Burger classicBurger;
	private Burger classicBurgerwCheese;
	private Burger classicBurgerwEgg;

	public BurgerFacade() {
		this.classicBurger = new ClassicBurger();
		this.classicBurgerwCheese = new ClassicCheeseBurger(classicBurger);
		this.classicBurgerwEgg = new ClassicEggBurger(classicBurger);
	}

	public void makeClassicBurger() {
		((ClassicBurger) classicBurger).setRoll("White Bread");
		((ClassicBurger) classicBurger).setMeat("Beef");
		((ClassicBurger) classicBurger).setSalad("Lettuce");

		classicBurger.makeBurger();

		System.out.println("The Classic Burger is Ready");
	}

	public void makeClassicBurgerWithCheese() {
		
		((ClassicCheeseBurger) classicBurgerwCheese).setCheese("Blue Cheese");
		classicBurgerwCheese.makeBurger();
		
		System.out.println("The Classic Cheese Burger is ready");
	}

	public void makeClassicBurgerWithEgg() {

		((ClassicEggBurger) classicBurgerwEgg).setEgg("2 eggs");
		classicBurgerwEgg.makeBurger();
		
		System.out.println("The Classic Egg Burger is Ready");
	}

}
