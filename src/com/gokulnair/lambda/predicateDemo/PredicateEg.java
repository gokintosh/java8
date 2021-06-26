package com.gokulnair.lambda.predicateDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEg{



    public static void main(String[] args) {
        Predicate<Integer>predicate=(t)->t%2==0;
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7);

        numbers.stream().filter(predicate).forEach((t)-> System.out.println(t));
    }
}
