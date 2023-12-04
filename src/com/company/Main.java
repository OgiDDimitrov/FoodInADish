package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FoodInADish<Food>> books;
        ArrayList<FoodInADish<Food>> dishes = new ArrayList<FoodInADish<Food>>();



        FoodInADish<Food> bananaBlue = new FoodInADish<Food>();
        Food f1 = new Fruit();
        f1.setName("Banana");
        f1.setKg(0.25);
        ((Fruit) f1).setReadyToEat(true);

        bananaBlue.setFood(f1);
        bananaBlue.setDishColor("Blue");

        dishes.add(bananaBlue);



        FoodInADish<Food> pepperGreen = new FoodInADish<Food>();
        Food f2 = new Vegetable();
        f2.setName("Peper");
        f2.setKg(0.10);
        ((Vegetable) f2).setFresh(true);

        pepperGreen.setFood(f2);
        pepperGreen.setDishColor("Green");

        dishes.add(pepperGreen);


        FoodInADish<Food> strawberryWhite = new FoodInADish<Food>();
        Food f3 = new Fruit();
        f3.setName("Strawberry");
        f3.setKg(0.05);
        ((Fruit) f3).setReadyToEat(true);

        strawberryWhite.setFood(f3);
        strawberryWhite.setDishColor("White");

        dishes.add(strawberryWhite);


        FoodInADish<Food> lettuceDarkblue = new FoodInADish<Food>();
        Food f4 = new Vegetable();
        f4.setName("Lettuce");
        f4.setKg(0.20);
        ((Vegetable) f4).setFresh(true);

        lettuceDarkblue.setFood(f4);
        lettuceDarkblue.setDishColor("Dark blue");

        dishes.add(lettuceDarkblue);


        FoodInADish<Food> blueberryYellow = new FoodInADish<Food>();
        Food f5 = new Fruit();
        f5.setName("Strawberry");
        f5.setKg(0.05);
        ((Fruit) f5).setReadyToEat(true);

        blueberryYellow.setFood(f5);
        blueberryYellow.setDishColor("Yellow");

        dishes.add(blueberryYellow);

        Collections.sort(dishes);
    }
}
