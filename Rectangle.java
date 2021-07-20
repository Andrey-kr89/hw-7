class Rectangle extends Shape{
    private int sideA;
    private int sideB;


    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        if (sideA != sideB) {
            this.setName("Rectangle");
        } else {
            this.setName("Square");
        }
    }

    public Rectangle(int sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.setName("Square");
    }

    public String sides() {
        return Integer.toString(sideA) + ", " + Integer.toString(sideB) + ";";
    }


    @Override
    public double area() {
        return sideA * sideB;
    }
}