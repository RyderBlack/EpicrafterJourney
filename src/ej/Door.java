package ej;

import java.awt.*;

public class Door extends Bloc{
    private boolean isLocked;

    public Door(final int width, final int height, final int length, final boolean isLocked) {
        super(width, height, length);
        this.isLocked = isLocked;
        this.color = Colors.RED;
    }

    public boolean isLocked() {
        return isLocked;
    }

    @Override
    public void displayDescription() {
        System.out.println("This a door");
    }
}
