package com.madeeasy;

public class Main {
    public static void main(String[] args) {
        DrawingAPI drawingAPI = new RedrawingAPI();

        Shape circle = new CircleShape(1, 2, 3, drawingAPI);
        Shape rectangle = new RectangleShape(1, 2, 4, 5, drawingAPI);

        circle.draw();
        rectangle.draw();
    }
}