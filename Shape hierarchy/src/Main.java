abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}
class Triangle extends Shape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }
    @Override
    double getPerimeter() {
        return sideOne + sideTwo + sideThree;
//Area=SQRT(s(s-a)(s-b)(s-c)), where s=(a+b+c)/2 or perimeter/2.
        //P=a+b+c
    }
    @Override
    double getArea() {
        double s = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
        
    }
}
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double getPerimeter() {
        //rect
        //A=wl  P=2(l+w)
        return 2 * (length + width);
    }
    double getArea() {
        return width * length;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double getPerimeter() {
        //circle A=πr2 C=2πr
        return 2 * Math.PI * radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
}
