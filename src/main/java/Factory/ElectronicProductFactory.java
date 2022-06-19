package Factory;


import Model.ElectronicProduct;

public class ElectronicProductFactory implements ProductFactory{
    @Override
    public ElectronicProduct create() {
        ElectronicProduct electronicProduct1 = new ElectronicProduct("Iphone 8", 50);
        return electronicProduct1;
    }
}
