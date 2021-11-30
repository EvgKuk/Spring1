package ru.geekbrains.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    public void init() {
        this.productList = new ArrayList<>();
        this.productList.add(new Product(1,"телефон", 10.0));
        this.productList.add(new Product(2,"гарнитура", 30.0));
        this.productList.add(new Product(1,"ноутбук", 250.0));
        this.productList.add(new Product(1,"книга", 40.0));
        this.productList.add(new Product(1,"фонарь", 10.0));
    }

    public Optional<Product> findProductById(Integer id) {
        return productList.stream().filter(product -> product.getId().equals(id)).findFirst();
    }
}
