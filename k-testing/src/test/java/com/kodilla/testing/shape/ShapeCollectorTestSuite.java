package com.kodilla.testing.shape;

import org.junit.*;

import java.util.Random;

import static java.lang.Math.round;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;
    private ShapeCollector shapeCollector;

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
        shapeCollector = new ShapeCollector();
    }
    @Test
    public void testAddFigure() {
        //Given

        //When
        boolean testAdd = shapeCollector.addFigure(new Triangle("Tri", 1.1 , 1.1,2.1));

        //Then
        Assert.assertEquals(true, testAdd);
    }
    @Test
    public void testGetFigure() {
        //Given
        shapeCollector.addFigure(new Circle("Cir", 1.5));
        //When
        Shape s = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals("Cir", s.getShapeName() );
    }
    @Test
    public void testGetFigureEmpty() {
        //Given

        //When

        //Then
        Assert.assertEquals(null, shapeCollector.getFigure(0) );
    }
    @Test
    public void testRemoveFiguree() {
        //Given

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
        Random rand = new Random();
        Double x = round(rand.nextDouble() * 10000.0)/100.0;
        System.out.println("X :" + x);
        Double y = round(rand.nextDouble() * 10000.0)/100.0;
        System.out.println("Y :" + y);
        Double field = x*y;

        //Shape shape = new Shape("circle", 7.1);
        shapeCollector.addFigure(new Square("Sq" , x , y));

        //When
        Shape s = shapeCollector.getFigure(0);

        //Then
        System.out.println("Field given: " + field + " Calculaded: " + s.getField());
        Assert.assertEquals( field , s.getField() , 0.001);
    }
}
