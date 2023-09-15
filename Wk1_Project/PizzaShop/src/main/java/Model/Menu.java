package Model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public Menu(List<String> pizzaMenu) {
        PizzaMenu = pizzaMenu;
    }

    private List<String> PizzaMenu = new ArrayList<String>();

    public List<String> getPizzaMenu() {
        return PizzaMenu;
    }

//    public void setPizzaMenu(List<String> pizzaMenu) {
//        PizzaMenu = pizzaMenu;
//    }

}
