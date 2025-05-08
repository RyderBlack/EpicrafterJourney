package ej;

import java.util.*;

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


        // List collection
        List<Integer> blocQuantityUsed= new ArrayList<Integer>();
        blocQuantityUsed.add(1);
        blocQuantityUsed.add(3);
        blocQuantityUsed.add(1);

        for(Integer quantity : blocQuantityUsed) {
            System.out.println(quantity);
        }

        blocQuantityUsed.remove(Integer.valueOf(3));


        // Set collection
        Set<String> keywordUsed = new LinkedHashSet<String>();
        keywordUsed.add("Java");
        keywordUsed.add("Java"); // Not compiled since we're using Set !
        keywordUsed.add("PHP");
        keywordUsed.add("C++");

        for(String keyword : keywordUsed) {
            System.out.println(keyword);
        }

    }

}




