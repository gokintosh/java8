package com.gokulnair.lambda.consumerDemo;

import java.util.Arrays;
import java.util.List;

public class ConsumerEg {

    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6);
        numbers.stream().forEach((t)-> System.out.println("Printing "+t));
    }


}
