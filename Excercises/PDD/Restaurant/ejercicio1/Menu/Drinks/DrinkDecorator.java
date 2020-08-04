package Restaurant.ejercicio1.Menu.Drinks;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class DrinkDecorator implements IDrink {
    protected IDrink wrappedDrink;
    protected String description;

    public DrinkDecorator(IDrink wrappedDrink) {
        this.wrappedDrink = wrappedDrink;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCost() {
        return this.wrappedDrink.getCost();
    }
}