package flower.store;

public class Chamomile extends Flower {

    private static final double SEPAL_LENGTH_CHAMOMILE = 4.1;
    private static final int PRICE_CHAMOMILE = 7;

    public Chamomile() {
        super(FlowerColor.GREEN, FlowerType.Chamomile,
                SEPAL_LENGTH_CHAMOMILE, PRICE_CHAMOMILE);
    }
}
