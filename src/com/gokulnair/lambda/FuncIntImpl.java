package com.gokulnair.lambda;

public class FuncIntImpl {

    public static void main(String[] args) {
        FuncInterface1 switchOn=()-> System.out.println("Swithching on!!");
        switchOn.m1();
        FuncInterface1 switchOff=()-> System.out.println("Switching off!!");
        switchOff.m1();
    }
}
