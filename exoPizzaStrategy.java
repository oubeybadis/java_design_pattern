public class exoPizzaStrategy {
    
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder()
                .setPate("thin")
                .setSauce("tomate")
                .setFromage("chevre")
                .build();

        CookingStrategy wood = new WoodFireCooking();
        wood.cook(pizza);
    }
}


interface CookingStrategy {
  public void cook(Pizza pizza);
}
public class WoodFireCooking implements CookingStrategy{
  @Override
  public void cook(Pizza pizza){
    System.out.println("woodfire..");
  }
}

public class Pizza {
    private String pate, sauce, fromage;

    private Pizza(PizzaBuilder builder) {
        this.pate = builder.pate;
        this.sauce = builder.sauce;
        this.fromage = builder.fromage;
    }

    // ---------- BUILDER ----------
    public static class PizzaBuilder {
        private String pate, sauce, fromage;

        public PizzaBuilder setPate(String pate) {
            this.pate = pate;
            return this;
        }

        public PizzaBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder setFromage(String fromage) {
            this.fromage = fromage;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

