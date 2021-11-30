package ru.geekbrains.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")

public class Cart {

    private final ProductRepository productRepository;
    private final List<Product> products;

    public Cart(ProductRepository productRepository){
        products = new ArrayList<>();
        this.productRepository = productRepository;
    }

    @Override
    public String toString() {
        return "Cart{" + "products= " + products + "}";
    }

    public void addProductById(Integer id){
        productRepository.findProductById(id).ifPresent(products);
    }
    public void deleteProductById(Integer id) {
        products.stream().filter(product -> product.getId().equals(id)).findFirst().ifPresent(products);
    }

}
