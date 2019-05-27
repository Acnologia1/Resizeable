package Resizeable;

import Interface.Perimeter;
import Interface.Resizeable;

public class Square extends Rectangle implements Perimeter, Resizeable {
    public Square(){
    }
    public Square(double side){
        super(side,side);
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "Side =" +getWidth();

    }

    @Override
    public double Perimeter() {
        return super.Perimeter();
    }

    @Override
    public double Resize(double percent) {
        return super.Resize(percent);
    }
}
