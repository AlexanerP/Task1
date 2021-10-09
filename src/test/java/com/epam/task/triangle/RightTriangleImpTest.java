package com.epam.task.triangle;

import org.junit.*;

import static org.junit.Assert.*;

public class RightTriangleImpTest {

    private Triangle rightTriangleImp;

    @Before
    public void initTest() {
        rightTriangleImp = new RightTriangleImp();
    }

    @Test
    public void trueSquareTest() throws Exception{
        double triangleLegA = 5;
        double triangleLegB = 10;

        double expected = 25;
        double actual = rightTriangleImp.square(triangleLegA, triangleLegB);

        assertTrue(expected == actual);
    }

    @Test
    public void falseSquareTest() throws Exception{
        double triangleLegA = 5;
        double triangleLegB = 10;

        double expected = 215;
        double actual = rightTriangleImp.square(triangleLegA, triangleLegB);

        assertNotEquals(expected, actual);
    }

    @Test
    public void truePerimeterTest() throws Exception{
        double triangleLegA = 3;
        double triangleLegB = 4;
        double expected = 12;
        double actual = rightTriangleImp.perimeter(triangleLegA, triangleLegB);
        assertTrue(expected == actual);
    }

    @Test
    public void falsePerimeterTest() throws Exception{
        double triangleLegA = 3;
        double triangleLegB = 4;

        double expected = 12123;
        double actual = rightTriangleImp.perimeter(triangleLegA, triangleLegB);

        assertFalse(expected == actual);
    }
}