package com.tarikc;

public class Student {

    private int age;

    public Student(){
        System.out.println("Object created!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
    }

}
