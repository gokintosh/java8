package com.gokulnair.lambda.supplierdemo;

import java.util.function.Supplier;

public class SupplierEg {

    public static void main(String[] args) {
        Supplier<String >supplier=()->"Hi this is me Gokul";


        System.out.println(supplier.get());
    }
}
