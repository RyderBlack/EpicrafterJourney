package ej;

public abstract class CalcRect {

    protected int width;
    protected int length;
    protected int height;

    public CalcRect(final int width, final int length, final int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // WIDTH
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // HEIGHT
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // LENGTH
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



}
