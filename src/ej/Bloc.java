package ej;

public abstract class Bloc implements IBloc {

    protected int width;
    protected int length;
    protected int height;

    public Bloc(final int width, final int length, final int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
}
