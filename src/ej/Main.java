package ej;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        IBloc new_wall = new Wall(10, 10, 5, true);
        new_wall.displayDescription();
        Rempart new_rempart = new Rempart(new_wall);

        var earth = new Planet("Earth", 40000.00, 510);
        System.out.println("The Planet " + earth.getName() + " has a surface of " + earth.surface() + " millions of km.");
        earth.displayPlanet();

        Colors colorChoice = Colors.GREEN;
        switch(colorChoice) {
            case GREEN -> System.out.println("This is the Green color");
            case BLUE -> System.out.println("This is the Blue color");
            case RED -> System.out.println("This is the Red color");
        }


        // Map
        Map<Bloc, Integer> quantityBlocUsed = new HashMap<Bloc, Integer>();
        quantityBlocUsed.put(new Wall(10, 10, 5, true), 4);
        quantityBlocUsed.put(new Door(10, 10, 5, true), 1);

        Set<Bloc> blocKeys = quantityBlocUsed.keySet();
        for(Bloc blocKey : blocKeys) {
            Integer quantity = quantityBlocUsed.get(blocKey);
            System.out.println(blocKey.getClass().getSimpleName() + ": " + quantity);
        }


        // Kit
        Kit starterKit = new Kit();
        starterKit.displayKit();

    }

}




