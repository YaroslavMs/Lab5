package flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class FlowerBucket {
    @Getter
    @Setter
    private List<FlowerPack> flowerPacks;

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double sum = 0;
        for (FlowerPack i : flowerPacks) {
            sum += i.getPrice();
        }
        return sum;
    }

}
