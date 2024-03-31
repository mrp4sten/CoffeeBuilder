package com.mrp4sten.org.Coffee.builders;

import java.util.List;

import com.mrp4sten.org.Coffee.Coffee;
import com.mrp4sten.org.Coffee.properties.CoffeeSize;
import com.mrp4sten.org.Coffee.properties.CoffeeType;

public class ConcreteCoffeeBuilder implements CoffeeBuilder {

  private CoffeeSize size;
  private CoffeeType type;
  private List<String> ingredients;

  @Override
  public CoffeeBuilder setSize(CoffeeSize size) {
    this.size = size;
    return this;
  }

  @Override
  public CoffeeBuilder setType(CoffeeType type) {
    this.type = type;
    return this;
  }

  @Override
  public CoffeeBuilder setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  @Override
  public Coffee build() {
    return new Coffee(size, type, ingredients);
  }

}
