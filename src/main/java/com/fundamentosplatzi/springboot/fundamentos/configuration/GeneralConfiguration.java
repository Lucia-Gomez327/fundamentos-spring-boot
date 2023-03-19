package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWhitProperties;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWhitPropertiesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;
    @Value("${value.apellido}")
    private String apellido;
    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWhitProperties funtion(){
        return new MyBeanWhitPropertiesImplement(name,apellido);
    }
}
