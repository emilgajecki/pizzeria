package impl;

import api.IPizza;

public class MyPizza implements IPizza {

    private String name;
    private double price;

    public MyPizza() {
        setName("Margarita");
        setPrice(17.5);
    }

    public MyPizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
