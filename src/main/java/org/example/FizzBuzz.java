package org.example;

/**
 * Hello world!
 *
 */
public class FizzBuzz
{
    public static String fizzBuzz(int num){
        if (num == 1){
            return "1";
        }else if (num == 0){
            return "0";
        }else{
            if (num%15 == 0){
                return "FizzBuzz";
            }else if (num%5 == 0){
                return "Buzz";
            }else if (num%3 == 0){
                return "Fizz";
            }else{
                return Integer.toString(num);
            }

        }
    }
}
