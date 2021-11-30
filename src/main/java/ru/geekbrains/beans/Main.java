package ru.geekbrains.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        var cart1 = context.getBean(Cart.class);
        var cart2 = context.getBean(Cart.class);

        cart1.addProductById(1);
        cart1.addProductById(2);
        cart1.addProductById(5);

        cart1.addProductById(1);
        cart1.deleteProductById(1);

        cart2.addProductById(4);
        cart1.addProductById(4);
        cart1.addProductById(4);
        cart1.deleteProductById(3);
        cart1.deleteProductById(4);

        System.out.println(cart1);
        System.out.println(cart2);

        context.close();

    }
}
