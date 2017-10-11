package com.k.testing.collection;

import com.k.testing.user.SimpleUser;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

        @Before
        public void before(){
            System.out.println("Test Case: begin");
        }
        @After
        public void after(){
            System.out.println("Test Case: end");
        }
        @BeforeClass
        public static void beforeClass() {
            System.out.println("Test Suite: begin");
        }
        @AfterClass
        public static void afterClass() {
            System.out.println("Test Suite: end");
        }
        @Test
        public void testOddNumbersExterminatorEmptyList(){
            //Given
                //List<Integer> even = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();
            List<Integer> results = new ArrayList<>();
            //When
                // to jest ciągle given
            OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
                
                // dopiero to jest when (when = kiedy wywolasz)
            results = oddNumbersExterminator.exterminate(even);
            //Then
            for (Integer obj : results) {
                Assert.assertTrue("You did wrong.",obj %2 == 0);
            }
            System.out.println(results);
        }
        @Test
        public void testOddNumbersExterminatorNormalList(){
            //Given
                //List<Integer> even = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();
            Random r = new Random();
            int i = 0;
            while (i < 10){
                even.add(r.nextInt(16) + 1);
                i++;
            }
            List<Integer> results = new ArrayList<>();
            //When
                // to do given
            OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
                //to dopiero when
            results = oddNumbersExterminator.exterminate(even);
            //Then
            for (Integer obj : results) {
                Assert.assertTrue("You did wrong.",obj %2 == 0);
            }
            System.out.println(results);
        }
}
