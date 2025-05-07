package ej;

public class Wall extends Bloc {

    private boolean porteur;

    public Wall(final int width, final int height, final int length, final boolean porteur) {
        super(width, height, length);
        this.porteur = porteur;
        this.color = Colors.BLACK;
    }

    public boolean isPorteur() {
        return !porteur;
    }

    @Override
    public void displayDescription() {
        System.out.println("This a wall!");
    }
}
