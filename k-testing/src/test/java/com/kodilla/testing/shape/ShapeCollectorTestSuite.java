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

        //When
        boolean testAdd = shapeCollector.addFigure(new Triangle("Tri", 1.1 , 1.1,2.1));

        //Then
        Assert.assertEquals(true, testAdd);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle("Cir", 1.5));
        //When
        Shape s = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals("Cir", s.getShapeName() );
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
        //Shape shape = new Shape("circle", 7.1);
        shapeCollector.addFigure(new Square("Sq" , 5.1 , 6.1));
        //When
        boolean testPass = shapeCollector.removeFigure(new Square("Sq" , 5.1 , 6.1));

        //Then
        Assert.assertEquals(true, testPass);
    }
    @Test
    public void testField() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //Shape shape = new Shape("circle", 7.1);
        shapeCollector.addFigure(new Square("Sq" , 5.1 , 6.1));
        //When
        Shape s = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(31.11 , s.getField() , 0.1);
    }
}
