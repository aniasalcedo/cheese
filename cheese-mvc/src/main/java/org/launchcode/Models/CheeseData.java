package org.launchcode.Models;

import java.util.ArrayList;

public class CheeseData {
    //this is so we cant repeat the same NAME of the Cheese
// (jesli uzyjemy tego samego name to zmieni sie tylko opis
// ale nie bedziemy miec dwoch takich samych elementow)
    static ArrayList<Cheese> cheeses = new ArrayList<>();

    //getAll
    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    //add
    public static void add(Cheese newCheese) {
        cheeses.add(newCheese);
    }

    //remove
    public static void remove (int id) {
        Cheese cheeseToRemove = getById(id);
        cheeses.remove(cheeseToRemove);

    }

    //getById
    public static Cheese getById(int id) {

        Cheese theCheese = null;

        for(Cheese candidateCheese : cheeses) {
            if (candidateCheese.getCheeseId() == id) {
                theCheese = candidateCheese;
            }
        }

        return theCheese;
    }
}
