import shapes.Rectangle;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Rectangle box1 instance of Rectangle = " + box1.getPerimeter() );
        System.out.println("Rectangle box1 instance of Rectangle = " + box1.getArea() );

        System.out.println();

        Rectangle box2 = new Square(5);
        System.out.println("Rectangle box2 instance of Square = " + box2.getPerimeter() );
        System.out.println("Rectangle box2 instance of Square = " + box2.getArea() );




    }
}
