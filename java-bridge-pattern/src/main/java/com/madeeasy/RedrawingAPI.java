package com.madeeasy;

public class RedrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing red circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawRectangle(double x1, double y1, double x2, double y2) {
        System.out.println("Drawing red rectangle from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
    }
}
