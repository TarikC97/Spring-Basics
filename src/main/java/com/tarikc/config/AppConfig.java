package com.tarikc.config;

import com.tarikc.Computer;
import com.tarikc.Desktop;
import com.tarikc.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Student student(Computer computer) {
    Student stud = new Student();
    stud.setAge(115);
    stud.setComp(computer);
    return stud;
    }

    @Bean(name = {"desk","desk2"})
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    };
}
