package com.epam.task.triangle;

public class RightTriangleImp implements Triangle {

    public double square(double triangleLegA, double triangleLegB) throws Exception {
        checkValue(triangleLegA, triangleLegB);
        return (triangleLegA * triangleLegB) / 2;
    }

    public double perimeter(double triangleLegA, double triangleLegB) throws Exception {
        checkValue(triangleLegA, triangleLegB);
        return Math.sqrt(Math.pow(triangleLegA, 2) + Math.pow(triangleLegB, 2)) + triangleLegA + triangleLegB;
    }

    private void checkValue(double triangleLegA, double triangleLegB) throws Exception {
        if(triangleLegA <= 0 || triangleLegB <= 0) {
            throw new Exception();
        }
    }
}
