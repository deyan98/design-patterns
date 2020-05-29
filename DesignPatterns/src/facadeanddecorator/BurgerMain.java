package facadeanddecorator;

public class BurgerMain {

	public static void main(String[] args) {

		BurgerFacade burgerFacade = new BurgerFacade();

		burgerFacade.makeClassicBurger();
		burgerFacade.makeClassicBurgerWithCheese();
		burgerFacade.makeClassicBurgerWithEgg();

	}

}
