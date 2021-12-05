package ru.geekbrains.beans;

public class Product {
    private Integer id;
    private String title;
    private Double cost;

    public Product(Integer id, String title, Double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "Product {" + "id = " + id + " title = " + title + " cost = " + cost + "}";
    }
}
