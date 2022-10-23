package flower.store;

public class Tulip extends Flower {

    private static final double SEPAL_LENGTH_TULIP = 4.1;
    private static final int PRICE_TULIP = 14;

    public Tulip() {
        super(FlowerColor.BLUE, FlowerType.Tulip, SEPAL_LENGTH_TULIP,
                PRICE_TULIP);
    }
}
