package com.tarikc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student stud =(Student) context.getBean("student");
//        stud.setAge(21);
//        System.out.println(stud.getAge());
        stud.code();

//        Student stud2 =(Student) context.getBean("student");
//        System.out.println(stud2.getAge());
//        stud.code();
//
    }
}
