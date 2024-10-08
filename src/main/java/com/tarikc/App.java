package com.tarikc;
import com.tarikc.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        //Spring to SpringBoot
        //SpringBoot Service
        //SpringBoot RepositoryLayer

        //Java Base Config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student stud =(Student) context.getBean(Student.class);
        System.out.println(stud.getAge());
        stud.code();

//        Desktop desktop = context.getBean(Desktop.class);
//        desktop.compile();
//
//        Desktop desktop2 = context.getBean(Desktop.class);
//        desktop.compile();


        //Xml Base Config
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Student stud =(Student) context.getBean("student");
////        stud.setAge(21);
//        System.out.println(stud.getAge());
//        stud.code();

//        Student stud2 =(Student) context.getBean("student");
//        System.out.println(stud2.getAge());
//        stud.code();
//
//        Desktop desk = context.getBean("comp2", Desktop.class);
    }
}
