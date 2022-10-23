package Flower.store;

public class Tulip extends Flower {

    private static final double sepalLengthTulip = 4.1;
    private static final int priceTulip = 14;

    public Tulip() {
        super(FlowerColor.BLUE, FlowerType.Tulip, sepalLengthTulip, priceTulip);
    }
}
