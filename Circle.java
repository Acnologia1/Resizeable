package Resizeable;

import Interface.Perimeter;
import Interface.Resizeable;

public class Circle implements Resizeable, Perimeter {
    private double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "A radius ="
                +getRadius();
    }

    @Override
    public double Perimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double Resize(double percent) {
        return percent * Perimeter();
    }
}
