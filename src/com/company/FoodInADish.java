package com.company;

public class FoodInADish<T> extends DrawableObj implements Comparable<FoodInADish<T> > {
    private T food;
    private String dishColor;

    public FoodInADish() {
        this.food = null;
        this.dishColor = " ";
    }

    public FoodInADish(int xCoord, int yCoord, int width, int height, T food, String dishColor) {
        super(xCoord, yCoord, width, height);
        this.food = food;
        this.dishColor = dishColor;
    }

    @Override
    public String toString() {
        return "FoodInADish{" +
                "food=" + food +
                ", dishColor='" + dishColor + '\'' +
                '}';
    }



    @Override
    public void draw() {

    }

    @Override
    public int compareTo(FoodInADish<T> o) {
        if (this.getFood() instanceof Fruit && o.getFood() instanceof Fruit) {
            return Double.compare(((Fruit) this.getFood()).getKg(), ((Fruit) o.getFood()).getKg());
        } else if (this.getFood() instanceof Vegetable &&o.getFood() instanceof Vegetable) {
            return Double.compare(((Vegetable) this.getFood()).getKg(), ((Vegetable) o.getFood()).getKg());
        } else if (this.getFood() instanceof Fruit) {
            return -1;
        } else
            return 1;
    }



    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColor() {
        return dishColor;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }
}
