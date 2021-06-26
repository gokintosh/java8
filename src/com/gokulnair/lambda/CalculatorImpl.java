package com.gokulnair.lambda;

public class CalculatorImpl {

    public static void main(String[] args) {
        Calculator sum=(a,b)-> System.out.println(a+b);

        Calculator product=(a,b)-> System.out.println(a*b);

        Calculator division=(a,b)-> System.out.println(a/b);

        Calculator subtraction=(a,b)-> System.out.println(a-b);


        product.calculate(10,30);
    }
}
