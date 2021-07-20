class Polygon extends Shape{
    private int sides;
    private int sideCount;


    public Polygon(int sides, int sideCount) {
        this.sides = sides;
        this.sideCount = sideCount;
        this.setName("Polygon");
    }

    public int getSides() {
        return sides;
    }

    public int getSideCount() {
        return sideCount;
    }

    @Override
    public double area() {
        return (sideCount * sides * sides) / (4 * (Math.tan((180 / sideCount) * (3.14 / 180))));
    }
}