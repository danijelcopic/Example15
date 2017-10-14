package com.danijelcopic.example15dc.provider;

import com.danijelcopic.example15dc.model.Category;
import com.danijelcopic.example15dc.model.Jelo;

import java.util.ArrayList;
import java.util.List;


public class JeloProvider {

    public static List<Jelo> getJelo() {

        Category pizza = new Category(0, "Pizza");
        Category salad = new Category(1, "Salad");
        Category soup = new Category(2, "Soup");



        List<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0, "pizza.png", "PIZZA MARGHERITA", 3.0f, "hot pizza with chilli flakes", "pizza", "fresh mushrooms, green peppers, pepperoni, and mozzarella cheese with onion",  "100g  eq.  266kcal", 9.45, pizza));
        jela.add(new Jelo(1, "salad.png", "CAESAR SALAD", 4.0f, "fresh salad with bacon and cheese", "salad", "green lettuce, olivie oil, beacon, Parmesan cheese",  "100g  eq.  166kcal", 7.73, salad));
        jela.add(new Jelo(2, "soup.png", "TOMATO SOUP", 5.0f, "tomato soup with blue cheese", "soup", "fresh tomato, blue cheese, croutons and black pepper",  "100g  eq.  98kcal", 4.92, soup));
        return jela;
    }




    public static List<String> getJeloIme() {

        List<String> names = new ArrayList<>();
        names.add("Pizza");
        names.add("Salad");
        names.add("Soup");
        return names;
    }




    public static Jelo getJeloById(int id) {

        Category pizza = new Category(0, "Pizza");
        Category salad = new Category(1, "Salad");
        Category soup = new Category(2, "Soup");


        switch (id) {
            case 0:
                return new Jelo(0, "pizza.png", "PIZZA MARGERITA", 3.0f, "hot pizza with chilli flakes", "pizza", "fresh mushrooms, green peppers, pepperoni, and mozzarella cheese with onion",  "100g  eq.  266kcal", 9.45, pizza);
            case 1:
                return new Jelo(1, "salad.png", "CAESAR SALAD", 4.0f, "fresh salad with bacon and cheese", "salad", "green lettuce, olivie oil, beacon, Parmesan cheese",  "100g  eq.  166kcal", 7.77, salad);
            case 2:
                return new Jelo(2, "soup.png", "TOMATO SOUP", 5.0f, "tomato soup with blue cheese", "soup", "fresh tomato, blue cheese, croutons and black pepper",  "100g  eq.  98kcal", 4.92, soup);
            default:
                return null;
        }
    }
}
