package com.mrp4sten.org.Coffee;

import java.util.List;

import com.mrp4sten.org.Coffee.properties.CoffeeSize;
import com.mrp4sten.org.Coffee.properties.CoffeeType;

import lombok.Data;

@Data
public class Coffee {
  private CoffeeSize size;
  private CoffeeType type;
  private List<String> ingredients;

  public Coffee(CoffeeSize size, CoffeeType type, List<String> ingredients) {
    this.size = size;
    this.type = type;
    this.ingredients = ingredients;
  }
}
