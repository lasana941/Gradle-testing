package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Shape("circle",7.1);

        //When
        boolean testAdd = shapeCollector.addFigure(shape);

        //Then
        Assert.assertEquals(true, testAdd);
    }
    @Test
    public void testAddFigureOutOfBand() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Shape("diamond",7.1);

        //When
        boolean testAdd = shapeCollector.addFigure(shape);

        //Then
        Assert.assertEquals(false, testAdd);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Shape("circle",7.1);
        shapeCollector.addFigure(shape);
        //When
        Shape s = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals("circle", s.getShapeName() );
    }
    @Test
    public void testGetFigureEmpty() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When


        //Then
        Assert.assertEquals(null, shapeCollector.getFigure(0) );
    }
    @Test
    public void testRemoveFiguree() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Shape("circle", 7.1);
        shapeCollector.addFigure(shape);
        //When
        boolean testPass = shapeCollector.removeFigure(shape);

        //Then
        Assert.assertEquals(true, testPass);
    }
}
