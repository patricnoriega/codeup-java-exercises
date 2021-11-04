package shapes;

import shapes.Rectangle;

public class Square extends Quadrilateral {
    public Square(int length, int width) {
        super(length, width);
    }

    int setLength() {
        return length;
    }

    int setWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
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
