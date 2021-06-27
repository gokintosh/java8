package com.gokulnair.lambda.lambdatuts;


interface Drawable{
    public void draw();
}
public class WithoutLambda {

    public static void main(String[] args) {
        int width=10;

       Drawable d1=()-> System.out.println("drawing with width "+width);

       d1.draw();
    }


}
