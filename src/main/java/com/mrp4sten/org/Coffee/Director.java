package com.mrp4sten.org.Coffee;

import java.util.List;

import com.mrp4sten.org.Coffee.builders.CoffeeBuilder;
import com.mrp4sten.org.Coffee.properties.CoffeeSize;
import com.mrp4sten.org.Coffee.properties.CoffeeType;

public class Director {

  public void buildBlackCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.BLACK)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Coffee"));
  }

  public void buildLatteCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.LATTE)
        .setSize(CoffeeSize.MEDIUM)
        .setIngredients(List.of("Espresso", "Steamed Milk"));
  }

  public void buildCappuccinoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.CAPPUCCINO)
        .setSize(CoffeeSize.LARGE)
        .setIngredients(List.of("Espresso", "Steamed Milk", "Foam"));
  }

  public void buildAmericanoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.AMERICANO)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Espresso", "Hot Water"));
  }

  public void buildEspressoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.ESPRESSO)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Espresso"));
  }

  public void buildDoppioCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.DOPPIO)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Espresso", "Espresso"));
  }

  public void buildCortadoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.CORTADO)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Espresso", "Steamed Milk"));
  }

  public void buildRedEyeCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.RED_EYE)
        .setSize(CoffeeSize.LARGE)
        .setIngredients(List.of("Coffee", "Espresso"));
  }

  public void buildGalaoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.GALAO)
        .setSize(CoffeeSize.LARGE)
        .setIngredients(List.of("Espresso", "Foam"));
  }

  public void buildLungoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.LUNGO)
        .setSize(CoffeeSize.LARGE)
        .setIngredients(List.of("Long pulled espresso"));
  }

  public void buildMacchiatoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.MACCHIATO)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Espresso shot", "Foam"));
  }

  public void buildMochaCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.MOCHA)
        .setSize(CoffeeSize.MEDIUM)
        .setIngredients(List.of("Espresso", "Steamed Milk", "Chocolate"));
  }

  public void buildRistrettoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.RISTRETTO)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Short pulled espresso"));
  }

  public void buildFlatWhiteCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.FLAT_WHITE)
        .setSize(CoffeeSize.MEDIUM)
        .setIngredients(List.of("Espresso", "Steamed Milk"));
  }

  public void buildAffogatoCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.AFFOGATO)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Espresso", "Vanilla Ice Cream"));
  }

  public void buildIrishCoffee(CoffeeBuilder builder) {
    builder.setType(CoffeeType.IRISH)
        .setSize(CoffeeSize.SMALL)
        .setIngredients(List.of("Coffee", "Whiskey", "Cream", "Sugar"));
  }
}
