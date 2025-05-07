package ej;

public record Planet(String name, double perimeter, int surface) implements IPlanet {

    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public int getSurface() {
        return surface;
    }

    @Override
    public void displayPlanet() {
        System.out.println("Planet: " + this.name);
    }

}
