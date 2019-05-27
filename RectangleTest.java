package Resizeable;

public class RectangleTest {
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle = new Rectangle(3.0,5.8);
        System.out.println("Diện tích trước");
        System.out.println(rectangle.Perimeter());
        double percent = 10;
        System.out.println("Diện tích sau");
        System.out.println(rectangle.Resize(percent));
    }
}
