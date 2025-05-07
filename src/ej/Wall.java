package ej;

public class Wall extends Bloc {

    private boolean porteur;

    public Wall(final int width, final int height, final int length, final boolean porteur) {
    super(width, height, length);
    this.porteur = porteur;
    }

    public boolean isPorteur() {
        return !porteur;
    }

}
