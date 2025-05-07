package ej;

public record Planet(String name, double perimeter, int surface) {

    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public int getSurface() {
        return surface;
    }

}
