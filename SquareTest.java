package Resizeable;

public class SquareTest {
    public static void main(String[] args){
        Square square = new Square();
        square = new Square(3.6);
        System.out.println("Diện tích trước");
        System.out.println(square.Perimeter());
        double percent = 10.0;
        System.out.println("Diện tích sau");
        System.out.println(square.Resize(percent));
    }
}
