package inheritanceSolve;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public double A() {
        return (double) Math.sqrt(Math.pow(getPoint2().getX() - getPoint1().getX(), 2)
                + Math.pow(getPoint2().getY() - getPoint1().getY(), 2));
    }

    public double B() {
        return (double) Math.sqrt(Math.pow(getPoint3().getX() - getPoint2().getX(), 2)
                + Math.pow(getPoint3().getY() - getPoint2().getY(), 2));
    }

    public double C() {
        return (double) Math.sqrt(Math.pow(getPoint4().getX() - getPoint3().getX(), 2)
                + Math.pow(getPoint4().getY() - getPoint3().getY(), 2));
    }

    public double D() {
        return (double) Math.sqrt(Math.pow(getPoint1().getX() - getPoint4().getX(), 2)
                + Math.pow(getPoint1().getY() - getPoint4().getY(), 2));
    }
}

class Trapezoid extends Quadrilateral {
    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    public double area() {
        double base1 = A();
        double base2 = C();
        double height = B();

        return 0.5 * (base1 + base2) * height;
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    public double area() {
        return A() * B();
    }
}

class Rectang extends Parallelogram {
    public Rectang(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double area() {
        // Corrected area calculation for a rectangle
        return A() * B();
    }
}

class Squares extends Rectang {
    public Squares(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double area() {
        // Corrected area calculation for a square
        return A() * B();
    }
}

public class new {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 5);
        Point point3 = new Point(5, 5);
        Point point4 = new Point(5, 0);

        Trapezoid trapezoid = new Trapezoid(point1, point2, point3, point4);
        Parallelogram parallelogram = new Parallelogram(point1, point2, point3, point4);
        Rectang rectang = new Rectang(point1, point2, point3, point4);
        Squares squares = new Squares(point1, point2, point3, point4);

        System.out.println("Area of Trapezoid: " + trapezoid.area());
        System.out.println("Area of Parallelogram: " + parallelogram.area());
        System.out.println("Area of Rectangle: " + rectang.area());
        System.out.println("Area of Square: " + squares.area());
    }
}
