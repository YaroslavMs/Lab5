package Flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rose extends Flower {

    private static final double sepalLengthRose = 4.1;
    private static final int priceRose = 10;

    public Rose() {
        super(FlowerColor.RED, FlowerType.Rose, sepalLengthRose, priceRose);
    }
}
