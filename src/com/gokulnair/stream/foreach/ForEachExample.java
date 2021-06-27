package com.gokulnair.stream.foreach;

import java.util.HashMap;
import java.util.Map;

public class ForEachExample {


    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"Rayban Justine");
        map.put(2,"Webcam");
        map.put(3,"Headphone");
        map.put(4,"Gaming Chair");
        map.put(5,"Apple Macbook Pro");
        map.put(6,"Apple watch");

//        map.forEach((key,value)-> System.out.println("The value at key "+key+" is : "+value));
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj-> System.out.println(obj));
    }
}
