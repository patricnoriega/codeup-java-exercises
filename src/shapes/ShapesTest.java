package shapes;

import shapes.Rectangle;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("Rectangle box1 instance of Rectangle Perimeter = " + box1.getPerimeter() );
//        System.out.println("Rectangle box1 instance of Rectangle Area = " + box1.getArea() );
//
//        System.out.println();
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Rectangle box2 instance of shapes.Square Perimeter = " + box2.getPerimeter() );
//        System.out.println("Rectangle box2 instance of shapes.Square Area = " + box2.getArea() );

        Measurable myShape = new Rectangle(4,5);

        System.out.println("Rectangle box1 perimeter = " + myShape.getPerimeter() );
        System.out.println("Rectangle box1 area = " + myShape.getArea() );

        System.out.println();

        Measurable myShape2 = new Square(3,3);
        System.out.println("Square box2 perimeter = " + myShape2.getPerimeter() );
        System.out.println("Square box2 perimeter = " + myShape2.getArea() );
    }
}
