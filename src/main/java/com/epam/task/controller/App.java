package com.epam.task.controller;

import com.epam.task.io.ReadFromConsole;
import com.epam.task.io.Read;
import com.epam.task.io.Write;
import com.epam.task.triangle.RightTriangleImp;
import com.epam.task.io.WriteToConsole;
import com.epam.task.triangle.Triangle;

public class App {

    private static String messageTriangleLegA = "Введите катет А прямоугольного треугольника -  ";
    private static String messageTriangleLegB = "Введите катет B прямоугольного треугольника - ";
    private static String messageRightTriangleSquare = "Площадь прямоугольного треугольника равна - ";
    private static String messageRightTrianglePerimeter = "Периметр прямоугольного треугольника равна - ";

    private static Read readFromConsole = new ReadFromConsole();
    private static Write writeToConsole = new WriteToConsole();
    private static Triangle rightTriangleImp = new RightTriangleImp();

    public static void main(String[] args) throws Exception{

        writeToConsole.output(messageTriangleLegA);
        double triangleLegA = Double.parseDouble(readFromConsole.getData());

        writeToConsole.output(messageTriangleLegB);
        double triangleLegB = Double.parseDouble(readFromConsole.getData());

        double triangleSquare = rightTriangleImp.square(triangleLegA, triangleLegB);
        writeToConsole.output(messageRightTriangleSquare + String.format("%.2f", triangleSquare));

        double trianglePerimeter = rightTriangleImp.perimeter(triangleLegA, triangleLegB);
        writeToConsole.output(messageRightTrianglePerimeter + String.format("%.2f", trianglePerimeter));
    }
}
