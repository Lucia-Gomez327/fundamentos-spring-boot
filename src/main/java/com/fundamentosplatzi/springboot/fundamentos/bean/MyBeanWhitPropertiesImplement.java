package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWhitPropertiesImplement implements MyBeanWhitProperties {

    private String name;
    private String apellido;

    public MyBeanWhitPropertiesImplement(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        return name + " - " + apellido;
    }
}
