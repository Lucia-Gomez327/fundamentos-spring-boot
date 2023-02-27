package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependencia {

    @Override
    public void saludar() {
        System.out.println("hola mundo");
    }


}
