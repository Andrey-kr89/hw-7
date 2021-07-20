class Round extends Shape{
    private int radius;


    public Round(int r) {
        this.radius = r;
        this.setName("Round");
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 3.14159 * radius * radius;
    }
}