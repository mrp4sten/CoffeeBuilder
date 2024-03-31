package com.mrp4sten.org.Coffee.builders;

import java.util.List;

import com.mrp4sten.org.Coffee.Coffee;
import com.mrp4sten.org.Coffee.properties.CoffeeSize;
import com.mrp4sten.org.Coffee.properties.CoffeeType;

public interface CoffeeBuilder {
  CoffeeBuilder setSize(CoffeeSize size);
  CoffeeBuilder setType(CoffeeType type);
  CoffeeBuilder setIngredients(List<String> ingredients);
  Coffee build();
}
