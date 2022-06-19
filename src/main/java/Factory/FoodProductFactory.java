package Factory;

import Model.FoodProduct;

public class FoodProductFactory implements ProductFactory{

    @Override
    public FoodProduct create() {
        FoodProduct foodProduct1 = new FoodProduct("Krep", 5);
        return foodProduct1;
    }
}
