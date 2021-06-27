package com.gokulnair.lambda.lambdatuts;


interface Sayable1{
    public String say(String input);
}
public class LambdaWithSingleParameter {

    public static void main(String[] args) {


        Sayable1 greetWithName=(name)->{
            return "hello "+name;
        };
        String name="gokul";

        System.out.println(greetWithName.say(name));

    }
}
