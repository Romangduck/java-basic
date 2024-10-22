package oop1.ex;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.width = 10;
        rec.height = 15;


        boolean isSquare = rec.caculateIsSquare();
        System.out.println(isSquare);
        int Area = rec.calculateArea();
        System.out.println(Area);
        int Perimeter = rec.calculatePerimeter();
        System.out.println(Perimeter);
    }
}
