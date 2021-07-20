class Triangle extends Shape{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.setName("Triangle");
    }

    public String sides() {
        return Integer.toString(sideA) + ", " + Integer.toString(sideB) + ", " + Integer.toString(sideC) + ";";
    }

    @Override
    public double area() {
        return (Math.sqrt((sideA + sideB + sideC) * (sideB + sideC - sideA) * (sideA + sideB - sideC) * (sideC + sideA - sideB))) / 4;
    }
}