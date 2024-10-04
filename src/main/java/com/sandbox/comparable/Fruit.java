package com.sandbox.comparable;

import java.sql.SQLOutput;
import java.util.*;

public class Fruit implements Comparable<Fruit> {
    private String fruitName;
    private int fruitQty;


    public Fruit(String name, int fruitQty) {
        this.fruitName = name;
        this.fruitQty = fruitQty;
    }

    public Fruit(String name) {
        this.fruitName = name;
        this.fruitQty = 0;
    }

    private Fruit() {

    }

    public String getName() {
        return fruitName;
    }

    public void setName(String name) {
        this.fruitName = name;
    }

    public int getFruitQty() {
        return fruitQty;
    }

    public void setFruitQty(int fruitQty) {
        this.fruitQty = fruitQty;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("Name='").append(fruitName).append('\'');
        sb.append(", Quantity=").append(fruitQty);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Fruit that) {
        if (this.fruitName.compareTo(that.fruitName) > 0) {
            return 1;
        } else if (this.fruitName.compareTo(that.fruitName) < 0) {
            return -1;
        } else {
           if (this.fruitQty > that.fruitQty) {
               return 1;
           } else if (this.fruitQty < that.fruitQty) {
               return -1;
           }
        }
        return 0;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 50);
        Fruit banana = new Fruit("Banana", 20);
        Fruit apple1 = new Fruit("Apple", 3);

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(banana);
        fruits.add(apple1);

        fruits.forEach(System.out::println);

        Collections.sort(fruits);
        System.out.println("After sorting");

        fruits.forEach(System.out::println);


    }
}
