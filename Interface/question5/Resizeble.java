package Interface.question5;

interface Resizeble {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizeble{
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width){
        this.width = width;
    }
    public void resizeHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}