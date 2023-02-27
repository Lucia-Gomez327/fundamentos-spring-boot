package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTowImplement implements ComponentDependencia{

    @Override
    public void saludar() {
        System.out.println("hola mundo 2 ");
    }
}
