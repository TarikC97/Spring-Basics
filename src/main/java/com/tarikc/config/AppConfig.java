package com.tarikc.config;

import com.tarikc.Computer;
import com.tarikc.Desktop;
import com.tarikc.Laptop;
import com.tarikc.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.tarikc")
public class AppConfig {

//    @Qualifier("desktop")
//    @Bean
//    public Student student( Computer computer) {
//    Student stud = new Student();
//    stud.setAge(115);
//    stud.setComp(computer);
//    return stud;
//    }
//
//    @Bean(name = {"desk","desk2"})
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    };
//
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
