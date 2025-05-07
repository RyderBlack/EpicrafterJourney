package ej;

public class Door extends Bloc{
    private boolean isLocked;

    public Door(final int width, final int height, final int length, final boolean isLocked) {
        super(width, height, length);
        this.isLocked = isLocked;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
