package Resizeable;

import Interface.Perimeter;
import Interface.Resizeable;

public class Rectangle implements Resizeable,Perimeter {
    private  double width;
    private double height;

    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Width ="+ getWidth()
                +"Height ="+ getHeight();

    }

    @Override
    public double Perimeter() {
        return 2 * (width * height);
    }

    @Override
    public double Resize(double percent) {
        return percent * Perimeter();
    }
}

