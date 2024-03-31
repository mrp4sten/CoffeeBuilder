import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mrp4sten.org.Coffee.Coffee;
import com.mrp4sten.org.Coffee.Director;
import com.mrp4sten.org.Coffee.builders.ConcreteCoffeeBuilder;
import com.mrp4sten.org.Coffee.properties.CoffeeSize;
import com.mrp4sten.org.Coffee.properties.CoffeeType;

public class DirectorTest {

  private static Director director;
  private static ConcreteCoffeeBuilder concreteCoffeeBuilder;

  @BeforeEach
  void Initialize() {
    director = new Director();
    concreteCoffeeBuilder = new ConcreteCoffeeBuilder();
  }

  @Test
  void testBuildEspressoCoffee() {
    director.buildEspressoCoffee(concreteCoffeeBuilder);
    Coffee coffee = concreteCoffeeBuilder.build();

    assertEquals(CoffeeType.ESPRESSO, coffee.getType());
    assertEquals(CoffeeSize.SMALL, coffee.getSize());
    assertEquals(List.of("Espresso"), coffee.getIngredients());
  }

  @Test
  void testBuildCappuccinoCoffee() {
    director.buildCappuccinoCoffee(concreteCoffeeBuilder);
    Coffee coffee = concreteCoffeeBuilder.build();

    assertEquals(CoffeeType.CAPPUCCINO, coffee.getType());
    assertEquals(CoffeeSize.LARGE, coffee.getSize());
    assertEquals(List.of("Espresso", "Steamed Milk", "Foam"), coffee.getIngredients());
  }

}
