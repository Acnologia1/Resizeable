package Resizeable;

public class CircleTest {
    public static void main(String[] args)
    {
        Circle circle = new Circle();
        circle = new Circle(10);
        System.out.println("Diện tích trước thay đổi");
        System.out.println(circle.Perimeter());
        double percent = 10.0;
        System.out.println("Diện tích sau thay đổi");
        System.out.println(circle.Resize(percent));
    }
}
