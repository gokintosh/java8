package com.gokulnair.lambda.lambdatuts;


interface Sayable{
    public String say();
}
public class LambdaWithoutArgs {

    public static void main(String[] args) {
        Sayable s1=()-> {return "Hello guys";};

        System.out.println(s1.say());

    }


}
