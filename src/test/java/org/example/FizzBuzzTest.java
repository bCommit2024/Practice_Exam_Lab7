package org.example;

import org.junit.*;
import static org.junit.Assert.*;


public class FizzBuzzTest {
    String [] strFizzBuzzAnswer;

    @Before
    public void setUpAnswer(){
        strFizzBuzzAnswer = new String[] {"0","1","2","Fizz","4","Buzz","Fizz","7","8","Fizz",
                                            "Buzz","11","Fizz","13","14","FizzBuzz","16","17","Fizz","19",
                                            "Buzz","Fizz","22","23","Fizz","Buzz","26","Fizz","28","29",
                                            "FizzBuzz","31","32","Fizz","34","Buzz","Fizz","37","38","Fizz",
                                            "Buzz","41","Fizz","43","44","FizzBuzz","46","47","Fizz","49",
                                          };
    }

    @Test
    public void testFizzBuzz0(){
       assertEquals(FizzBuzz.fizzBuzz(0),strFizzBuzzAnswer[0]);
    }
}
