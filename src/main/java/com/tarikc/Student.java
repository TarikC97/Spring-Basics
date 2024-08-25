package com.tarikc;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private int age;
    private Computer comp;

    public Student(){}

//    public Student(int age,Computer comp){
//         this.age = age;
//         this.comp = comp;
//         System.out.println("Params Constructor");
//    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }
    public Computer getComp() {
        return comp;
    }
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding");
        comp.compile();
    }

}
