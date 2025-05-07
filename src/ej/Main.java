package ej;

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

    }

}