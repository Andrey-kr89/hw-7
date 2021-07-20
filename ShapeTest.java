public class ShapeTest {
    public static void main(String[] args) {

        Round rou = new Round(5);
        System.out.print("Figure is ");
        NamePrinter.namePrint(rou);
        System.out.println( " radius " + rou.getRadius() + " area is " + rou.area());

        Rectangle rec = new Rectangle(12, 123);
        System.out.print("Figure is ");
        NamePrinter.namePrint(rec);
        System.out.println(" sides are " + rec.sides() + " area is " + rec.area());

        Rectangle square = new Rectangle(12);
        System.out.print("Figure is ");
        NamePrinter.namePrint(square);
        System.out.println( " sides are " + square.sides() + " area is " + square.area());

        Triangle tri = new Triangle(12, 12, 22);
        System.out.print("Figure is ");
        NamePrinter.namePrint(tri);
        System.out.println( " sides are " + tri.sides() + " area is " + tri.area());

        Polygon pol = new Polygon(22, 6);
        System.out.print("Figure is ");
        NamePrinter.namePrint(pol);
        System.out.println(". it has "+ pol.getSideCount() +" sides, " + pol.getSides() + " each. Area is " + pol.area());

        Ellipse ell = new Ellipse(55, 5);
        System.out.print("Figure is ");
        NamePrinter.namePrint(ell);
        System.out.println(" big radius is "+ ell.getRadiusBig() + " small radius is " + ell.getRadiusSmall() + " Area is " + ell.area());



    }

}
