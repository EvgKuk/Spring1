package ru.geekbrains.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;



@Component
public class ProductRepository {


    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = new ArrayList<>();
        productList.add(new Product(1,"телефон", 10.0));
        productList.add(new Product(2,"гарнитура", 30.0));
        productList.add(new Product(3,"ноутбук", 250.0));
        productList.add(new Product(4,"книга", 40.0));
        productList.add(new Product(5,"фонарь", 10.0));
    }

    public Optional<Product> findProductById(Integer id) {
        return productList.stream().filter(product -> Objects.equals(product.getId(), id)).findFirst();
    }
}
