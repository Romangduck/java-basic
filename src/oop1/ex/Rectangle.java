package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int area;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return (width + height) * 2;
    }

    boolean caculateIsSquare() {
        return width == height ;
    }


}
