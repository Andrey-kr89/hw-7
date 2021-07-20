class Ellipse extends Shape{
    private int radiusBig;
    private int radiusSmall;

    public Ellipse(int radiusBig, int radiusSmall) {
        this.radiusBig = radiusBig;
        this.radiusSmall = radiusSmall;
        this.setName("Ellipse");
    }

    public int getRadiusBig() {
        return radiusBig;
    }

    public int getRadiusSmall() {
        return radiusSmall;
    }

    @Override
    public double area() {
        return 3.14159 * radiusSmall * radiusBig;
    }
}