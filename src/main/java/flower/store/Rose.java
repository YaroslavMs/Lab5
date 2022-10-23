package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rose extends Flower {

    private static final double SEPAL_LENGTH_ROSE = 4.1;
    private static final int PRICE_ROSE = 10;

    public Rose() {
        super(FlowerColor.RED, FlowerType.Rose, SEPAL_LENGTH_ROSE, PRICE_ROSE);
    }

}
