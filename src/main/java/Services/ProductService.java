package Services;

import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<Product> createProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 11", 200));
        products.add(new Product("iPhone 12", 100));
        products.add(new Product("MacBook Pro", 400));
        products.add(new Product("MacBook air", 350));
        products.add(new Product("Mac Mini", 300));
        products.add(new Product("Xiaomi Redmi Note 6", 500));
        products.add(new Product("Huawei P9 Lite", 600));
        return products;
    }
}
