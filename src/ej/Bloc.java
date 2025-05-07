package ej;

public abstract class Bloc implements IBloc {

    protected int width;
    protected int length;
    protected int height;
    protected Colors color;

    public Bloc(final int width, final int length, final int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
