package com.tarikc.config;

import com.tarikc.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {"desk","desk2"})
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    };
}
