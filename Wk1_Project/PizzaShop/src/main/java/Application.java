import Model.Menu;
import Model.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Create Pizzas
        Pizza pizza1 = new Pizza("Cheese Pizza", 10);
        Pizza pizza2 = new Pizza("Pepperoni Pizza", 20);
        Pizza pizza3 = new Pizza("Buffalo Chicken Pizza", 30);
        Pizza pizza4 = new Pizza("Vegetarian Pizza", 40);


        List<Pizza> menu = new ArrayList<>();

            menu.add(pizza1);
            menu.add(pizza2);
            menu.add(pizza3);
            menu.add(pizza4);


            Menu pizzaMenu = new Menu(menu);

          List menu1 = pizzaMenu.getPizzaMenu();

        for (int i = 0; i<pizzaMenu.getPizzaMenu().size(); i++){
            System.out.println(menu1.get(i).toString());

        }


        }

    }

