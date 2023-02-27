package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWhitDependencyImplement implements  MyBeanWhitDependency {
   private MyOperation myOperation;

    public MyBeanWhitDependencyImplement (MyOperation myOperation){
        this.myOperation = myOperation;
    }

    @Override
    public void printWhitDependency() {
        int num = 4;
        System.out.println(this.myOperation.suma(num));
        System.out.println("hola desde ls implementacion de un bean co ndependencia");
    }
}
