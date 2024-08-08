package com.tarikc;

public class Laptop implements Computer {
//    public Laptop(){
//        System.out.println("Laptop Object created");
//    }
    @Override
    public void compile(){
        System.out.println("Compile Laptop");
    }
}
