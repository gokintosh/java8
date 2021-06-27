package com.gokulnair.lambda.lambdatuts;

interface Calculator{
    public int calculate(int a,int b);
}
public class LambdaWithMultipleParameters {

    public static void main(String[] args) {
        Calculator add=(a,b)->{return a+b;};
        Calculator subtract=(a,b)->{
            return a-b;
        };
        Calculator multiplication=(a,b)->{
            return a*b;
        };
        Calculator division=(a,b)->{
            if(!(b==0)){
                return a/b;
            }
            else
                throw new RuntimeException("Division with 0 is not supported !!");
        };


        System.out.println("addition "+ add.calculate(10,20));
        System.out.println("subtraction "+subtract.calculate(10,20));
        System.out.println("multiplication "+multiplication.calculate(10,20));
        System.out.println("division "+division.calculate(10,0));
    }

}
