package com.gokulnair.lambda.lambdatuts;

import java.util.ArrayList;
import java.util.List;

public class ForEach {


    public static void main(String[] args) {
        List<String>wishList=new ArrayList<>();

        wishList.add("Rayban justine");
        wishList.add("WebCam");
        wishList.add("Gaming chair");
        wishList.add("Apple watch");
        wishList.add("Macbook pro");



        wishList.stream().filter(t->t.toLowerCase().startsWith("m")).forEach(t-> System.out.println(t));

//        for(String s:wishList){
//            if(s.toLowerCase().startsWith("m"))
//                System.out.println(s);
//        }
    }
}
