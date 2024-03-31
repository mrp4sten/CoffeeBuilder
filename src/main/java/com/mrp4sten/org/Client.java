package com.mrp4sten.org;

import com.mrp4sten.org.Coffee.Coffee;
import com.mrp4sten.org.Coffee.Director;
import com.mrp4sten.org.Coffee.builders.ConcreteCoffeeBuilder;

public class Client {
    public static void main(String[] args) {
        // Create a director
        Director director = new Director();

        // Make Capuccino
        ConcreteCoffeeBuilder concreteCoffeeBuilder = new ConcreteCoffeeBuilder();
        director.buildCappuccinoCoffee(concreteCoffeeBuilder);

        // See the result
        Coffee cappuccino = concreteCoffeeBuilder.build();
        System.out.println("\n\t Coffe build: " + cappuccino.getType());
        cappuccino.getIngredients().forEach((ingredient) -> System.out.println("\n\t\t " + ingredient));
        
        // Make Irish Coffee
        director.buildIrishCoffee(concreteCoffeeBuilder);
        Coffee irishCoffee = concreteCoffeeBuilder.build();
        System.out.println("\n\t Coffe build: " + irishCoffee.getType());
        irishCoffee.getIngredients().forEach((ingredient) -> System.out.println("\n\t\t " + ingredient));

    }
}