package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean beanOperation(){
        // se devuelve la implementacion de myBean
        return new MyBeanTowImplement();
    };

    @Bean
    public MyOperation benaOperationOperation(){
        // se devuelve la implementacion de MyOperation
        return new MyOperationImplement();
    };
    @Bean
    public MyBeanWhitDependency beanWhitDependencyImplement(MyOperation myOperation){
        // se devuelve la implementacion de MyOperationImplement
        return new MyBeanWhitDependencyImplement(myOperation);
    };
}
