package shapes;

import shapes.Rectangle;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public void setLength(double side) {
        this.length = side;
    }

    public void setWidth(double side) {
         this.width = side;
    }

    public double getPerimeter() {
        double side = this.length;
        return side * 4;
    }

    public double getArea() {
        double side = this.width;
        return side * side;
    }
//protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//    public int getArea() {
//        return side * side;
//    }
//
//    public int getPerimeter() {
//        return 4 * side;
//    }

    }
