package com.danijelcopic.example15dc.provider;

import com.danijelcopic.example15dc.model.Ingridients;

import java.util.ArrayList;
import java.util.List;


public class IngridientsProvider {

    public static List<Ingridients> getIngridients() {

        List<Ingridients> ingridients = new ArrayList<>();
        ingridients.add(new Ingridients(0, "fresh mushrooms, green peppers, pepperoni, and mozzarella cheese with onion"));
        ingridients.add(new Ingridients(1, "green lettuce, olivie oil, beacon, Parmesan cheese"));
        ingridients.add(new Ingridients(2, "fresh tomato, blue cheese, croutons and black pepper"));
        return ingridients;
    }

    public static List<String> getIngridientsNames() {
        List<String> names = new ArrayList<>();
        names.add("fresh mushrooms, green peppers, pepperoni, and mozzarella cheese with onion");
        names.add("green lettuce, olivie oil, beacon, Parmesan cheese");
        names.add("fresh tomato, blue cheese, croutons and black pepper");
        return names;
    }

    public static Ingridients getIngridientsById(int id) {
        switch (id) {
            case 0:
                return new Ingridients(0, "fresh mushrooms, green peppers, pepperoni, and mozzarella cheese with onion");
            case 1:
                return new Ingridients(1, "green lettuce, olivie oil, beacon, Parmesan cheese");
            case 2:
                return new Ingridients(2, "fresh tomato, blue cheese, croutons and black pepper");
            default:
                return null;
        }
    }
}
